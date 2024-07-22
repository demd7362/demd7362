
Hi There :hand:
```java
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

class NestJS extends Technology {
    public NestJS(SkillLevel skillLevel) {
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

interface Developer {
    String explainAboutMyTech();
}
interface JobSeeker {
    void introduce();
}

public class JihunJeong implements Developer, JobSeeker {
    private final Set<ProgramingLanguage> programingLanguages = new HashSet<>();
    private static final int BIRTH_YEAR = 1995;
    private static final String NAME = "정지훈";
    private int myAge;
    private static final String STAR = "★";

    private JihunJeong(Set<ProgramingLanguage> programingLanguages) {
        this.myAge = LocalDate.now().getYear() - BIRTH_YEAR + 1;
        this.programingLanguages.addAll(programingLanguages);
    }

    public static TechBuilder iWantToTellYouSomething() {
        return new TechBuilder();
    }

    public static class TechBuilder {
        private final Set<ProgramingLanguage> programingLanguages = new HashSet<>();

        public TechBuilder iCanDo(ProgramingLanguage programingLanguage) {
            this.programingLanguages.add(programingLanguage);
            return this;
        }

        public JihunJeong ready() {
            return new JihunJeong(this.programingLanguages);
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
    @Override
    public String explainAboutMyTech() {
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
        Assert.notEmpty(this.programingLanguages, "아직 저를 소개할 준비가 안됐습니다. 잠시만 기다려주세요.");
        System.out.println("안녕하세요! 저는 %s이구요, %d살입니다.".formatted(NAME, this.myAge));
        System.out.println(explainAboutMyTech());
    }

    public static void main(String[] args) {
        JobSeeker jihunJeong = JihunJeong.iWantToTellYouSomething()
                .iCanDo(new Java(SkillLevel.HIGH).with(new Spring(SkillLevel.HIGH)))
                .iCanDo(new JavaScript(SkillLevel.HIGH).with(new NestJS(SkillLevel.MEDIUM)).with(new React(SkillLevel.MEDIUM)))
                .iCanDo(new Python(SkillLevel.LOW).with(new FastApi(SkillLevel.LOW)))
                .ready();
        jihunJeong.introduce();
    }
}

```
---

<img align="left" src="https://github-readme-stats-sigma-five.vercel.app/api/top-langs/?username=demd7362&theme=dracula&exclude_repo=clone-web-scrapper,clone-zoom&hide=Procfile&layout=compact&langs_count=8"/>
<img algin="right" src="http://mazassumnida.wtf/api/v2/generate_badge?boj=demd7362">




  
