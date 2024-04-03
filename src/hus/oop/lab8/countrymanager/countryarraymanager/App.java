package hus.oop.lab8.countrymanager.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();

        /* TODO: write code to test program */
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                * TODO: create Country and append countries into 
                * CountryArrayManager here.
                */
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        /* TODO */
    }

    public static void testSortIncreasingByArea() {
        /* TODO */
    }

    public static void testSortDecreasingByArea() {
        /* TODO */
    }

    public static void testSortIncreasingByGdp() {
        /* TODO */
    }

    public static void testSortDecreasingByGdp() {
        /* TODO */
    }

    public static void testFilterAfricaCountry() {
        /* TODO */
    }

    public static void testFilterAsiaCountry() {
        /* TODO */
    }

    public static void testFilterEuropeCountry() {
        /* TODO */
    }

    public static void testFilterNorthAmericaCountry() {
        /* TODO */
    }

    public static void testFilterOceaniaCountry() {
        /* TODO */
    }

    public static void testFilterSouthAmericaCountry() {
        /* TODO */
    }

    public static void testFilterMostPopulousCountries() {
        /* TODO */
    }

    public static void testFilterLeastPopulousCountries() {
        /* TODO */
    }

    public static void testFilterLargestAreaCountries() {
        /* TODO */
    }

    public static void testFilterSmallestAreaCountries() {
        /* TODO */
    }

    public static void testFilterHighestGdpCountries() {
        /* TODO */
    }

    public static void testFilterLowestGdpCountries() {
        /* TODO */
    }
}
