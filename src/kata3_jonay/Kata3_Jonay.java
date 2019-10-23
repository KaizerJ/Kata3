package kata3_jonay;

public class Kata3_Jonay {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("outlook.es");
        histogram.increment("yahoo.es");
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram,
                                                                 "Emails",
                                                                 "Ocurrences", 
                                                                 "Custom Title");
        histogramDisplay.execute();
    }
    
}
