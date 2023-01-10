public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;
    int sozluOrtEtki;
    int ortalama;

    public Course(String name, String code, String prefix, int sozluOrtEtki) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozlu = 0;
        this.sozluOrtEtki=sozluOrtEtki;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    public double calculateAvarage(){
        ortalama= this.sozlu*sozluOrtEtki/100 + note*(100-sozluOrtEtki)/100;
        return ortalama;

    }
}
