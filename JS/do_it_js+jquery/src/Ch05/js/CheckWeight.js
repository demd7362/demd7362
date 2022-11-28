function CheckWeight(name, height, weight) {
    this.name = name;
    this.height = height;
    this.weight = weight;
    // 웬만하면 setter 쓰자
    CheckWeight.prototype.getInfo = function () {
        let str = "";
        str += "이름 : " + this.name + ",";
        str += "키 : " + this.height + ",";
        str += "몸무게 : " + this.weight + "<br>";
        return str;
    }
    CheckWeight.prototype.getResult = function () {
        let minWeight = (this.height - 100) * 0.9 - 5;
        let maxWeight = (this.height - 100) * 0.9 + 5;

        if (this.weight >= minWeight && this.weight <= maxWeight) return "정상 몸무게입니다";
        else if (this.weight < minWeight) return "몸무게 미달입니다";
        else if (this.weight > maxWeight) return "비만입니다";
    }
}