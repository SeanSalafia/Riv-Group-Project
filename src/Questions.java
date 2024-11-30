import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


public class Questions {

    HashMap<String, String> questionAnswerPairs = new HashMap<>();

    public Questions() {
        questionAnswerPairs = new HashMap<>();
        // Add country-capital pairs
        questionAnswerPairs.put("Afghanistan", "Kabul");
        questionAnswerPairs.put("Albania", "Tirana");
        questionAnswerPairs.put("Algeria", "Algiers");
        questionAnswerPairs.put("Andorra", "Andorra la Vella");
        questionAnswerPairs.put("Angola", "Luanda");
        questionAnswerPairs.put("Antigua and Barbuda", "Saint John's");
        questionAnswerPairs.put("Argentina", "Buenos Aires");
        questionAnswerPairs.put("Armenia", "Yerevan");
        questionAnswerPairs.put("Australia", "Canberra");
        questionAnswerPairs.put("Austria", "Vienna");
        questionAnswerPairs.put("Azerbaijan", "Baku");
        questionAnswerPairs.put("Bahamas", "Nassau");
        questionAnswerPairs.put("Bahrain", "Manama");
        questionAnswerPairs.put("Bangladesh", "Dhaka");
        questionAnswerPairs.put("Barbados", "Bridgetown");
        questionAnswerPairs.put("Belarus", "Minsk");
        questionAnswerPairs.put("Belgium", "Brussels");
        questionAnswerPairs.put("Belize", "Belmopan");
        questionAnswerPairs.put("Benin", "Porto-Novo");
        questionAnswerPairs.put("Bhutan", "Thimphu");
        questionAnswerPairs.put("Bolivia", "Sucre");
        questionAnswerPairs.put("Bosnia and Herzegovina", "Sarajevo");
        questionAnswerPairs.put("Botswana", "Gaborone");
        questionAnswerPairs.put("Brazil", "Brasília");
        questionAnswerPairs.put("Brunei", "Bandar Seri Begawan");
        questionAnswerPairs.put("Bulgaria", "Sofia");
        questionAnswerPairs.put("Burkina Faso", "Ouagadougou");
        questionAnswerPairs.put("Burundi", "Gitega");
        questionAnswerPairs.put("Cabo Verde", "Praia");
        questionAnswerPairs.put("Cambodia", "Phnom Penh");
        questionAnswerPairs.put("Cameroon", "Yaoundé");
        questionAnswerPairs.put("Canada", "Ottawa");
        questionAnswerPairs.put("Central African Republic", "Bangui");
        questionAnswerPairs.put("Chad", "N'Djamena");
        questionAnswerPairs.put("Chile", "Santiago");
        questionAnswerPairs.put("China", "Beijing");
        questionAnswerPairs.put("Colombia", "Bogotá");
        questionAnswerPairs.put("Comoros", "Moroni");
        questionAnswerPairs.put("Congo (Congo-Brazzaville)", "Brazzaville");
        questionAnswerPairs.put("Costa Rica", "San José");
        questionAnswerPairs.put("Croatia", "Zagreb");
        questionAnswerPairs.put("Cuba", "Havana");
        questionAnswerPairs.put("Cyprus", "Nicosia");
        questionAnswerPairs.put("Czechia (Czech Republic)", "Prague");
        questionAnswerPairs.put("Denmark", "Copenhagen");
        questionAnswerPairs.put("Djibouti", "Djibouti");
        questionAnswerPairs.put("Dominica", "Roseau");
        questionAnswerPairs.put("Dominican Republic", "Santo Domingo");
        questionAnswerPairs.put("Ecuador", "Quito");
        questionAnswerPairs.put("Egypt", "Cairo");
        questionAnswerPairs.put("El Salvador", "San Salvador");
        questionAnswerPairs.put("Equatorial Guinea", "Malabo");
        questionAnswerPairs.put("Eritrea", "Asmara");
        questionAnswerPairs.put("Estonia", "Tallinn");
        questionAnswerPairs.put("Eswatini (fmr. Swaziland)", "Mbabane");
        questionAnswerPairs.put("Ethiopia", "Addis Ababa");
        questionAnswerPairs.put("Fiji", "Suva");
        questionAnswerPairs.put("Finland", "Helsinki");
        questionAnswerPairs.put("France", "Paris");
        questionAnswerPairs.put("Gabon", "Libreville");
        questionAnswerPairs.put("Gambia", "Banjul");
        questionAnswerPairs.put("Georgia", "Tbilisi");
        questionAnswerPairs.put("Germany", "Berlin");
        questionAnswerPairs.put("Ghana", "Accra");
        questionAnswerPairs.put("Greece", "Athens");
        questionAnswerPairs.put("Grenada", "Saint George's");
        questionAnswerPairs.put("Guatemala", "Guatemala City");
        questionAnswerPairs.put("Guinea", "Conakry");
        questionAnswerPairs.put("Guinea-Bissau", "Bissau");
        questionAnswerPairs.put("Guyana", "Georgetown");
        questionAnswerPairs.put("Haiti", "Port-au-Prince");
        questionAnswerPairs.put("Holy See", "Vatican City");
        questionAnswerPairs.put("Honduras", "Tegucigalpa");
        questionAnswerPairs.put("Hungary", "Budapest");
        questionAnswerPairs.put("Iceland", "Reykjavik");
        questionAnswerPairs.put("India", "New Delhi");
        questionAnswerPairs.put("Indonesia", "Jakarta");
        questionAnswerPairs.put("Iran", "Tehran");
        questionAnswerPairs.put("Iraq", "Baghdad");
        questionAnswerPairs.put("Ireland", "Dublin");
        questionAnswerPairs.put("Israel", "Jerusalem");
        questionAnswerPairs.put("Italy", "Rome");
        questionAnswerPairs.put("Jamaica", "Kingston");
        questionAnswerPairs.put("Japan", "Tokyo");
        questionAnswerPairs.put("Jordan", "Amman");
        questionAnswerPairs.put("Kazakhstan", "Astana");
        questionAnswerPairs.put("Kenya", "Nairobi");
        questionAnswerPairs.put("Kiribati", "South Tarawa");
        questionAnswerPairs.put("Kuwait", "Kuwait City");
        questionAnswerPairs.put("Kyrgyzstan", "Bishkek");
        questionAnswerPairs.put("Laos", "Vientiane");
        questionAnswerPairs.put("Latvia", "Riga");
        questionAnswerPairs.put("Lebanon", "Beirut");
        questionAnswerPairs.put("Lesotho", "Maseru");
        questionAnswerPairs.put("Liberia", "Monrovia");
        questionAnswerPairs.put("Libya", "Tripoli");
        questionAnswerPairs.put("Liechtenstein", "Vaduz");
        questionAnswerPairs.put("Lithuania", "Vilnius");
        questionAnswerPairs.put("Luxembourg", "Luxembourg");
        questionAnswerPairs.put("Madagascar", "Antananarivo");
        questionAnswerPairs.put("Malawi", "Lilongwe");
        questionAnswerPairs.put("Malaysia", "Kuala Lumpur");
        questionAnswerPairs.put("Maldives", "Malé");
        questionAnswerPairs.put("Mali", "Bamako");
        questionAnswerPairs.put("Malta", "Valletta");
        questionAnswerPairs.put("Marshall Islands", "Majuro");
        questionAnswerPairs.put("Mauritania", "Nouakchott");
        questionAnswerPairs.put("Mauritius", "Port Louis");
        questionAnswerPairs.put("Mexico", "Mexico City");
        questionAnswerPairs.put("Micronesia", "Palikir");
        questionAnswerPairs.put("Moldova", "Chișinău");
        questionAnswerPairs.put("Monaco", "Monaco");
        questionAnswerPairs.put("Mongolia", "Ulaanbaatar");
        questionAnswerPairs.put("Montenegro", "Podgorica");
        questionAnswerPairs.put("Morocco", "Rabat");
        questionAnswerPairs.put("Mozambique", "Maputo");
        questionAnswerPairs.put("Myanmar (formerly Burma)", "Naypyidaw");
        questionAnswerPairs.put("Namibia", "Windhoek");
        questionAnswerPairs.put("Nauru", "Yaren District (de facto)");
        questionAnswerPairs.put("Nepal", "Kathmandu");
        questionAnswerPairs.put("Netherlands", "Amsterdam");
        questionAnswerPairs.put("New Zealand", "Wellington");
        questionAnswerPairs.put("Nicaragua", "Managua");
        questionAnswerPairs.put("Niger", "Niamey");
        questionAnswerPairs.put("Nigeria", "Abuja");
        questionAnswerPairs.put("North Korea", "Pyongyang");
        questionAnswerPairs.put("North Macedonia (formerly Macedonia)", "Skopje");
        questionAnswerPairs.put("Norway", "Oslo");
        questionAnswerPairs.put("Oman", "Muscat");
        questionAnswerPairs.put("Pakistan", "Islamabad");
        questionAnswerPairs.put("Palau", "Ngerulmud");
        questionAnswerPairs.put("Palestine State", "Ramallah");
        questionAnswerPairs.put("Panama", "Panama City");
        questionAnswerPairs.put("Papua New Guinea", "Port Moresby");
        questionAnswerPairs.put("Paraguay", "Asunción");
        questionAnswerPairs.put("Peru", "Lima");
        questionAnswerPairs.put("Philippines", "Manila");
        questionAnswerPairs.put("Poland", "Warsaw");
        questionAnswerPairs.put("Portugal", "Lisbon");
        questionAnswerPairs.put("Qatar", "Doha");
        questionAnswerPairs.put("Romania", "Bucharest");
        questionAnswerPairs.put("Russia", "Moscow");
        questionAnswerPairs.put("Rwanda", "Kigali");
        questionAnswerPairs.put("Saint Kitts and Nevis", "Basseterre");
        questionAnswerPairs.put("Saint Lucia", "Castries");
        questionAnswerPairs.put("Saint Vincent and the Grenadines", "Kingstown");
        questionAnswerPairs.put("Samoa", "Apia");
        questionAnswerPairs.put("San Marino", "San Marino");
        questionAnswerPairs.put("Sao Tome and Principe", "São Tomé");
        questionAnswerPairs.put("Saudi Arabia", "Riyadh");
        questionAnswerPairs.put("Senegal", "Dakar");
        questionAnswerPairs.put("Serbia", "Belgrade");
        questionAnswerPairs.put("Seychelles", "Victoria");
        questionAnswerPairs.put("Sierra Leone", "Freetown");
        questionAnswerPairs.put("Singapore", "Singapore");
        questionAnswerPairs.put("Slovakia", "Bratislava");
        questionAnswerPairs.put("Slovenia", "Ljubljana");
        questionAnswerPairs.put("Solomon Islands", "Honiara");
        questionAnswerPairs.put("Somalia", "Mogadishu");
        questionAnswerPairs.put("South Africa", "Pretoria (administrative)");
        questionAnswerPairs.put("South Korea", "Seoul");
        questionAnswerPairs.put("South Sudan", "Juba");
        questionAnswerPairs.put("Spain", "Madrid");
        questionAnswerPairs.put("Sri Lanka", "Sri Jayawardenepura Kotte");
        questionAnswerPairs.put("Sudan", "Khartoum");
        questionAnswerPairs.put("Suriname", "Paramaribo");
        questionAnswerPairs.put("Sweden", "Stockholm");
        questionAnswerPairs.put("Switzerland", "Bern");
        questionAnswerPairs.put("Syria", "Damascus");
        questionAnswerPairs.put("Tajikistan", "Dushanbe");
        questionAnswerPairs.put("Tanzania", "Dodoma");
        questionAnswerPairs.put("Thailand", "Bangkok");
        questionAnswerPairs.put("Timor-Leste", "Dili");
        questionAnswerPairs.put("Togo", "Lomé");
        questionAnswerPairs.put("Tonga", "Nukuʻalofa");
        questionAnswerPairs.put("Trinidad and Tobago", "Port of Spain");
        questionAnswerPairs.put("Tunisia", "Tunis");
        questionAnswerPairs.put("Turkey", "Ankara");
        questionAnswerPairs.put("Turkmenistan", "Ashgabat");
        questionAnswerPairs.put("Tuvalu", "Funafuti");
        questionAnswerPairs.put("Uganda", "Kampala");
        questionAnswerPairs.put("Ukraine", "Kyiv");
        questionAnswerPairs.put("United Arab Emirates", "Abu Dhabi");
        questionAnswerPairs.put("United Kingdom", "London");
        questionAnswerPairs.put("United States", "Washington, D.C.");
        questionAnswerPairs.put("Uruguay", "Montevideo");
        questionAnswerPairs.put("Uzbekistan", "Tashkent");
        questionAnswerPairs.put("Vanuatu", "Port Vila");
        questionAnswerPairs.put("Venezuela", "Caracas");
        questionAnswerPairs.put("Vietnam", "Hanoi");
        questionAnswerPairs.put("Yemen", "Sana'a");
        questionAnswerPairs.put("Zambia", "Lusaka");
        questionAnswerPairs.put("Zimbabwe", "Harare");
    }


    public String getRandomCountry() {
        List<String> keys = new ArrayList<>(questionAnswerPairs.keySet());
        Random random = new Random();
        return keys.get(random.nextInt(keys.size()));
    }

    public boolean checkAnswer(String country, String userAnswer) {
        String correctAnswer = questionAnswerPairs.get(country);
        return correctAnswer != null && correctAnswer.equalsIgnoreCase(userAnswer.trim());
    }

}

