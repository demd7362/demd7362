Execute below code here 👉 https://www.jdoodle.com/ia/1dhT

```java
public class HiThere {
    public static void main(String[] args) {
        JobSeeker jihunJeong = Developer.wantToTellYouSomething()
                .myNameIs("정지훈")
                .bornIn(1995)
                .phoneNumberIs("010-4544-7362")
                .emailAddressIs("demd7362@gmail.com")
                .iCanDo(new Java(SkillLevel.HIGH).with(new Spring(SkillLevel.HIGH)))
                .iCanDo(new JavaScript(SkillLevel.HIGH).with(new NestJs(SkillLevel.MEDIUM)).with(new React(SkillLevel.MEDIUM)))
                .iCanDo(new Python(SkillLevel.LOW).with(new FastApi(SkillLevel.LOW)))
                .readyToWork();
        jihunJeong.introduce();
    }
}
```

<details>
  <summary>See more...</summary>
    <div markdown="1">
        
```java
class Developer implements JobSeeker {
    private final Set<ProgramingLanguage> programingLanguages;
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final int age;
    private static final String STAR = "★";
    private static final String MESSAGE = "아직 저를 소개할 준비가 안됐습니다.";

    private Developer(String name, int age, String email, String phoneNumber, Set<ProgramingLanguage> programingLanguages) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.programingLanguages = new HashSet<>(programingLanguages);
    }

    public static DeveloperBuilder wantToTellYouSomething() {
        return new DeveloperBuilder();
    }

    public static class DeveloperBuilder {
        private final Set<ProgramingLanguage> programingLanguages = new HashSet<>();
        private String name;
        private int age;
        private String phoneNumber;
        private String email;

        public DeveloperBuilder myNameIs(String name) {
            this.name = name;
            return this;
        }

        public DeveloperBuilder bornIn(int year) {
            this.age = LocalDate.now().getYear() - year + 1;
            return this;
        }

        public DeveloperBuilder emailAddressIs(String email) {
            this.email = email;
            return this;
        }

        public DeveloperBuilder phoneNumberIs(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public DeveloperBuilder iCanDo(ProgramingLanguage programingLanguage) {
            this.programingLanguages.add(programingLanguage);
            return this;
        }

        public Developer readyToWork() {
            Assert.hasText(this.name, MESSAGE);
            Assert.hasText(this.phoneNumber, MESSAGE);
            Assert.hasText(this.email, MESSAGE);
            Assert.isTrue(this.age > 0, MESSAGE);
            return new Developer(this.name, this.age, this.email, this.phoneNumber, this.programingLanguages);
        }
    }

    private String writeStars(SkillLevel skillLevel) {
        int count = switch (skillLevel) {
            case HIGH -> 3;
            case MEDIUM -> 2;
            case LOW -> 1;
        };
        return " " + STAR.repeat(count);
    }

    private String explainAboutMyTech() {
        List<String> descriptions = new ArrayList<>();
        for (ProgramingLanguage programingLanguage : this.programingLanguages) {
            StringBuilder languageDescriptionBuilder = new StringBuilder();
            languageDescriptionBuilder.append(programingLanguage.getClass().getSimpleName())
                    .append("은(는) ")
                    .append(programingLanguage.description())
                    .append(writeStars(programingLanguage.getSkillLevel()));
            descriptions.add(languageDescriptionBuilder.toString());
            Set<Technology> technologies = programingLanguage.getTechnologies();
            if (!technologies.isEmpty()) {
                List<String> skillDescriptions = technologies.stream()
                        .map(technology -> technology.desciption() + writeStars(technology.getSkillLevel()))
                        .toList();
                descriptions.addAll(skillDescriptions);
            }
        }
        return String.join("\n", descriptions);
    }

    @Override
    public void introduce() {
        Assert.notEmpty(this.programingLanguages, MESSAGE);
        System.out.printf("안녕하세요! 저는 %s이구요, %d살입니다.%n", this.name, this.age);
        System.out.println(explainAboutMyTech());
        System.out.printf("구직하고 있습니다. 연락주세요! \nTel %s\nEmail %s", this.phoneNumber, this.email);
    }


}

interface JobSeeker {
    void introduce();
}

enum SkillLevel {
    LOW,
    MEDIUM,
    HIGH
}

@Getter
@RequiredArgsConstructor
abstract class Technology {
    private final SkillLevel skillLevel;

    public abstract String desciption();
}

class Spring extends Technology {
    public Spring(SkillLevel skillLevel) {
        super(skillLevel);
    }

    @Override
    public String desciption() {
        return "Spring으로 JPA 또는 Mybatis를 사용해 Restful한 백엔드 서버를 구축할 수 있습니다.";
    }
}

class FastApi extends Technology {
    public FastApi(SkillLevel skillLevel) {
        super(skillLevel);
    }

    @Override
    public String desciption() {
        return "FastApi와 SqlAlchemy를 사용해 간단한 웹서버를 배포해본 경험이 있습니다.";
    }
}

class React extends Technology {
    public React(SkillLevel skillLevel) {
        super(skillLevel);
    }

    @Override
    public String desciption() {
        return "함수형 컴포넌트로 웹앱을 만들 수 있습니다. 전역 상태 관리 도구로 redux-toolkit과 zustand를 사용할 수 있습니다.";
    }
}

class NestJs extends Technology {
    public NestJs(SkillLevel skillLevel) {
        super(skillLevel);
    }

    @Override
    public String desciption() {
        return "Nest.js로 Prisma를 사용해 간단한 API 서버를 구축할 수 있습니다.";
    }
}

@Getter
@RequiredArgsConstructor
abstract class ProgramingLanguage {
    private final SkillLevel skillLevel;
    private final Set<Technology> technologies = new HashSet<>();

    public ProgramingLanguage with(Technology technology) {
        this.technologies.add(technology);
        return this;
    }

    public abstract String description();
}

class Java extends ProgramingLanguage {
    public Java(SkillLevel skillLevel) {
        super(skillLevel);
    }

    @Override
    public String description() {
        return "주로 회사에서 업무에 많이 사용했고 익숙합니다.";
    }
}

class JavaScript extends ProgramingLanguage {
    public JavaScript(SkillLevel skillLevel) {
        super(skillLevel);
    }

    @Override
    public String description() {
        return "제가 제일 좋아하는 언어입니다. 타입스크립트도 사용 가능합니다.";
    }
}

class Python extends ProgramingLanguage {
    public Python(SkillLevel skillLevel) {
        super(skillLevel);
    }

    @Override
    public String description() {
        return "문법은 알고 있는 수준이나, 능숙하게 다루는 프레임워크는 없습니다.";
    }
}
```

</div>
</details>

---

<img align="left" src="https://github-readme-stats-sigma-five.vercel.app/api/top-langs/?username=demd7362&theme=dracula&exclude_repo=clone-web-scrapper,clone-zoom&hide=Procfile&layout=compact&langs_count=8"/>
<img algin="right" src="http://mazassumnida.wtf/api/v2/generate_badge?boj=demd7362">




  
