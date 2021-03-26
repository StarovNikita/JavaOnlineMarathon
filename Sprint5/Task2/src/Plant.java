enum Color{
    WHITE("White"),
    RED("Red"),
    BLUE("Blue");
    private String color;

    Color(String color) {
        this.color = color;
    }

}
enum Type{
    RARE("Rare"),
    ORDINARY("Ordinary");
    private String type;

    Type(String type) {
        this.type = type;
    }
}
class ColorException extends  Exception{
    public ColorException(String message) {
        super(message);
    }
}
class TypeException extends Exception{
    public TypeException(String message) {
        super(message);
    }
}
class Plant {
    private String name;
    private Color color;
    private Type type;

    public boolean IsColorInEnum(String color) throws ColorException {
        boolean result = true;
        try {
            Color.valueOf(color);
        }
        catch (IllegalArgumentException e){
            result = false;
        }
        return result;
    }
    public boolean IsTypeInEnum(String type) throws TypeException{
        boolean result = true;
        try {
            Type.valueOf(type);
        }
        catch (IllegalArgumentException e){
            result = false;
        }
        return result;
    }
    public Plant(String type,  String color, String name) throws TypeException,ColorException {

        if (IsTypeInEnum(type)){
            this.type = Type.valueOf(type);
            if (IsColorInEnum(color)){
                this.color = Color.valueOf(color);
            }
            else
                throw new ColorException("Invalid value " + color + " for field color");
        }
        else
            throw new TypeException("Invalid value " + type + " for field type");
        if (IsColorInEnum(color)){
            this.color = Color.valueOf(color);
            if (IsTypeInEnum(type)){
                this.type = Type.valueOf(type);

            }
            else
                throw new TypeException("Invalid value " + type + " for field type");
        }
        else
            throw new ColorException("Invalid value " + color + " for field color");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "{type: " + type+
                ", color: " + color+
                ", name: " + name +"}";
    }

}
