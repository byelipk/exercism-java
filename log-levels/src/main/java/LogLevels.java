public class LogLevels {

    public static String message(String logLine) {
        int colonIndex = logLine.indexOf(":");
        String messageString = logLine.substring(colonIndex + 1);
        String trimmed = messageString.trim();

        return trimmed;
    }

    public static String logLevel(String logLine) {
        int colonIndex = logLine.indexOf(":");
        String level = logLine.substring(0, colonIndex);

        String levelWithoutBrackets = level.replace(
                "[", "").replace("]", "");

        return levelWithoutBrackets.toLowerCase();
    }

    public static String reformat(String logLine) {
        String msg = message(logLine);
        String level = logLevel(logLine);

        return msg + " " + "(" + level + ")";
    }
}
