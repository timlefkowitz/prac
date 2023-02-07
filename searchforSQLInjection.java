public static boolean searchforSQLInjection(String strSearchTarget){

    try
    {
        if(strSearchTarget.contains("'"))
            return true;
        if(strSearchTarget.contains("#"))
            return true;    
        if(strSearchTarget.contains(";"))
            return true;
        if(strSearchTarget.contains("insert"))
            return true;
        if(strSearchTarget.contains("update"))
            return true;
        if(strSearchTarget.contains("select"))
            return true;

    }
    catch (exception e)
    {
        System.out.println("Error while searching string: " + e.toString());
        return false;
    }
    return false;
}

public static void testfunction()
{
    String strTest = " this is a test <script> ";
    booleanbTest = searchforSQLInjection(strTest);
}