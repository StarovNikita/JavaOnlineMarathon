enum LineType{
    SOLID,
    DOTTED,
    DASHED,
    DOUBLE
}

    public static String drawLine(LineType lineType) {

        // Write method code here
        String result = "The line is <LineType> type";
        switch (lineType){
            case SOLID:
                 result = result.replace("<LineType>","solid");
                 break;
            case DASHED:
                result = result.replace("<LineType>","dashed");
                break;
            case DOTTED:
                result = result.replace("<LineType>","dotted");
                break;
            case DOUBLE:
                result = result.replace("<LineType>","double");
                break;
        }
return result;
    }
