package banking;

public enum GradeType {

    GRADE1(1),
    GRADE2(2),
    GRADE3(3);

    private final int value;

    GradeType(final int newValue){
        value = newValue;
    }

    public int getValue(){
        return value;
    }
}
