public class UitgeverijApp {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();
        processor.voegProcesToe(new VervangProces("hij", "hij/zij"));
        processor.voegProcesToe(new BadWordsProces());
        processor.voegProcesToe(new HoofdletterProces());

        BadWordsProces.Voegtoe("kut");
        String inputString = "Een kut student loopt meestal in het derde jaar stage. Dan moet hij zelf een kut stageplek vinden.";
        String result = processor.verwerk(inputString);
        System.out.println(result);
    }
}