public enum Week {

    MONDAY ("Дуйшонбу"),
    TUESDAY ("Шейшенби"),
    WEDNESDAY ("Шаршенби"),
    THURSDAY ("Бейшенби"),
    FRIDAY ("Жума"),
    SATURDAY ("Ишенби"),
    SUNDAY ("Жекшенби");



    private String day;


    Week(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "week{" +
                "day='" + day + '\'' +
                '}';
    }
}
