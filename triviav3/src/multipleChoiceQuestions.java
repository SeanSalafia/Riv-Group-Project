import java.util.*;


public class multipleChoiceQuestions {

    HashMap<String, List<String>> questionAnswerPairs;


    public multipleChoiceQuestions() {
        questionAnswerPairs = new HashMap<>();
        // Add country-capital pairs
        populateQuestionAnswerPairs();


    }

    public void populateQuestionAnswerPairs() {
        questionAnswerPairs.put("Afghanistan", Arrays.asList("Kabul","Beirut","Baghdad","Herat"));
        questionAnswerPairs.put("Albania", Arrays.asList("Tirana","Durres","Vlore","Shkoder"));
        questionAnswerPairs.put("Algeria", Arrays.asList("Algiers","Oran","Constantine","Annaba"));
        questionAnswerPairs.put("Andorra", Arrays.asList("Andorra la Vella","Escaldes-Engordany","Encamp","Sant Julia de Loria"));
        questionAnswerPairs.put("Angola", Arrays.asList("Luanda","N'dalatando","Lobito","Benguela"));
        questionAnswerPairs.put("Antigua and Barbuda", Arrays.asList("Saint John's","Piggotts","Bolands","Codrington"));
        questionAnswerPairs.put("Argentina", Arrays.asList("Buenos Aires","Corboda","Rosario","Mendoza"));
        questionAnswerPairs.put("Armenia", Arrays.asList("Yerevan","Gyumri","Vanadzor","Vagharshapat"));
        questionAnswerPairs.put("Australia", Arrays.asList("Canberra","Sydney","Melbourne","Brisbane"));
        questionAnswerPairs.put("Austria", Arrays.asList("Vienna","Graz","Linz","Favoriten"));
        questionAnswerPairs.put("Azerbaijan", Arrays.asList("Baku","Ganja","Sunqayit","Lankaran"));
        questionAnswerPairs.put("Bahamas", Arrays.asList("Nassau","Lucaya","Freeport","West End"));
        questionAnswerPairs.put("Bahrain", Arrays.asList("Manama","Al Muharraq","Ar Rifa'","Dar Kulayb"));
        questionAnswerPairs.put("Bangladesh", Arrays.asList("Dhaka","Chittagong","Khulna","Rajshahi"));
        questionAnswerPairs.put("Barbados", Arrays.asList("Bridgetown","Speightstown","Oistins","Bathsheba"));
        questionAnswerPairs.put("Belarus", Arrays.asList("Minsk","Gomel","Mahilyow","Vitebsk"));
        questionAnswerPairs.put("Belgium", Arrays.asList("Brussels","Antwerpen","Gent","Charleroi"));
        questionAnswerPairs.put("Belize", Arrays.asList("Belmopan","Belize City","San Ignacio","Orange Walk"));
        questionAnswerPairs.put("Benin", Arrays.asList("Porto-Novo","Cotonou","Abomey-Calavi"));
        questionAnswerPairs.put("Bhutan", Arrays.asList("Thimphu","Punakha","Tsirang","Phuntsholing"));
        questionAnswerPairs.put("Bolivia", Arrays.asList("Sucre","Santa Cruz de la Sierra","Cochabamba","La Paz"));
        questionAnswerPairs.put("Bosnia and Herzegovina", Arrays.asList("Sarajevo","Banja Luka","Zenica","Tulza"));
        questionAnswerPairs.put("Botswana", Arrays.asList("Gaborone","Francistown","Molepolole","Selebi-Phikwe"));
        questionAnswerPairs.put("Brazil", Arrays.asList("Brasília","Sao Paulo","Rio de Janeiro","Salvador"));
        questionAnswerPairs.put("Brunei", Arrays.asList("Bandar Seri Begawan","Kuala Belait","Seria","Tutong"));
        questionAnswerPairs.put("Bulgaria", Arrays.asList("Sofia","Plovdiv","Varna","Burgas"));
        questionAnswerPairs.put("Burkina Faso", Arrays.asList("Ouagadougou","Bobo-Dioulasso","Koudougou","Ouahigouya"));
        questionAnswerPairs.put("Burundi", Arrays.asList("Gitega","Bujumbura","Muyinga","Ruyigi"));
        questionAnswerPairs.put("Cabo Verde", Arrays.asList("Praia","Mindelo","Santa Maria","Cova Figueira"));
        questionAnswerPairs.put("Cambodia", Arrays.asList("Phnom Penh","Takeo","Sihanoukville","Battambang"));
        questionAnswerPairs.put("Cameroon", Arrays.asList("Yaoundé","Douala","Garoua","Kousseri"));
        questionAnswerPairs.put("Canada", Arrays.asList("Ottawa","Toronto","Montreal","Calgary"));
        questionAnswerPairs.put("Central African Republic", Arrays.asList("Bangui","Bimbo","Mbaiki","Berberati"));
        questionAnswerPairs.put("Chad", Arrays.asList("N'Djamena","Moundou","Sarh","Abeche"));
        questionAnswerPairs.put("Chile", Arrays.asList("Santiago","Puente Alto","Antofagasta"));
        questionAnswerPairs.put("China", Arrays.asList("Beijing","Shanghai","Tianjin","Guangzhou"));
        questionAnswerPairs.put("Colombia", Arrays.asList("Bogotá","Cali","Medellin","Barranquilla"));
        questionAnswerPairs.put("Comoros", Arrays.asList("Moroni","Moutsamoudou","Fomboni","Domoni"));
        questionAnswerPairs.put("Congo (Congo-Brazzaville)", Arrays.asList("Brazzaville","Pointe-Noire","Dolisie","Nkayi"));
        questionAnswerPairs.put("Costa Rica", Arrays.asList("San José","Limon","San Francisco","Alajuela"));
        questionAnswerPairs.put("Croatia", Arrays.asList("Zagreb","Split","Rijeka","Osijek"));
        questionAnswerPairs.put("Cuba", Arrays.asList("Havana","Santiago de Cuba","Camaguey","Holguin"));
        questionAnswerPairs.put("Cyprus", Arrays.asList("Nicosia","Limassol","Larnaca","Famagusta"));
        questionAnswerPairs.put("Czechia (Czech Republic)", Arrays.asList("Prague","Brno","Ostrava","Pilsen"));
        questionAnswerPairs.put("Denmark", Arrays.asList("Copenhagen","Arhus","Odense","Aalborg"));
        questionAnswerPairs.put("Djibouti", Arrays.asList("Djibouti","Danan","'Ali Sabieh","Tadjourah"));
        questionAnswerPairs.put("Dominica", Arrays.asList("Roseau","Portsmouth","Berekua","Saint Joseph"));
        questionAnswerPairs.put("Dominican Republic", Arrays.asList("Santo Domingo","Santiago de los Caballeros","Santo Dominigo Oeste","Santo Dominigo Este"));
        questionAnswerPairs.put("Ecuador", Arrays.asList("Quito","Guayaquil","Cuenca","Santo Dominigo de los Colorados"));
        questionAnswerPairs.put("Egypt", Arrays.asList("Cairo","Alexandria","Giza","Port Said"));
        questionAnswerPairs.put("El Salvador", Arrays.asList("San Salvador","Soyapango","Santa Ana","San Miguel"));
        questionAnswerPairs.put("Equatorial Guinea", Arrays.asList("Malabo","Bata","Ebebiyin","Aconibe"));
        questionAnswerPairs.put("Eritrea", Arrays.asList("Asmara","Keren","Massawa","Assab"));
        questionAnswerPairs.put("Estonia", Arrays.asList("Tallinn","Tartu","Narva","Kohtla-Jaerve"));
        questionAnswerPairs.put("Eswatini (fmr. Swaziland)", Arrays.asList("Mbabane","Manzini","Big Bend","Malkerns"));
        questionAnswerPairs.put("Ethiopia", Arrays.asList("Addis Ababa","Dire Dawa","Mek'ele","Nazret"));
        questionAnswerPairs.put("Fiji", Arrays.asList("Suva","Lautoka","Nadi","Labasa"));
        questionAnswerPairs.put("Finland", Arrays.asList("Helsinki","Espoo","Tampere","Vantaa"));
        questionAnswerPairs.put("France", Arrays.asList("Paris","Marseille","Lyon","Toulouse"));
        questionAnswerPairs.put("Gabon",Arrays.asList( "Libreville","Port-Gentil","Franceville","Oyen"));
        questionAnswerPairs.put("Gambia", Arrays.asList("Banjul","Serekunda","Bakau","Brikama"));
        questionAnswerPairs.put("Georgia", Arrays.asList("Tbilisi","Kutaisi","Batumi","Sokhumi"));
        questionAnswerPairs.put("Germany", Arrays.asList("Berlin","Hamburg","Munich","Koeln"));
        questionAnswerPairs.put("Ghana", Arrays.asList("Accra","Kumasi","Tamale","Takoradi"));
        questionAnswerPairs.put("Greece", Arrays.asList("Athens","Thessaloniki","Patra","Piraeus"));
        questionAnswerPairs.put("Grenada", Arrays.asList("Saint George's","Gouyave","Grenville","Victoria"));
        questionAnswerPairs.put("Guatemala", Arrays.asList("Guatemala City","Mixco","Villa Nueva","Petapa"));
        questionAnswerPairs.put("Guinea", Arrays.asList("Conakry","Camayenne","Nzerekore","Kindia"));
        questionAnswerPairs.put("Guinea-Bissau", Arrays.asList("Bissau","Bafata","Gabu","Bissora"));
        questionAnswerPairs.put("Guyana", Arrays.asList("Georgetown","Linden","New Amsterdam","Anna Regnina"));
        questionAnswerPairs.put("Haiti", Arrays.asList("Port-au-Prince","Carrefour","Delmas 73","Petionville"));
        questionAnswerPairs.put("Holy See", Arrays.asList("Vatican City","Rome","Ciampino","Fonte Nuova"));
        questionAnswerPairs.put("Honduras", Arrays.asList("Tegucigalpa","San Pedro Sula","Choloma","La Ceiba"));
        questionAnswerPairs.put("Hungary", Arrays.asList("Budapest","Debrecen","Miskolc","Szeged"));
        questionAnswerPairs.put("Iceland", Arrays.asList("Reykjavik","Kopavogur","Hafnarfjoedur","Akureyri"));
        questionAnswerPairs.put("India", Arrays.asList("New Delhi","Mumbai","Bengaluru","Kolkata"));
        questionAnswerPairs.put("Indonesia", Arrays.asList("Jakarta","Surabaya","Medan","Bandung"));
        questionAnswerPairs.put("Iran", Arrays.asList("Tehran","Mashhad","Isfahan","Karaj"));
        questionAnswerPairs.put("Iraq", Arrays.asList("Baghdad","Basrah","Al Mawsil al Jadidah","Al Basrah al Qadimah"));
        questionAnswerPairs.put("Ireland", Arrays.asList("Dublin","Cork","Dun Laoghaire","Luimneach"));
        questionAnswerPairs.put("Israel", Arrays.asList("Jerusalem","Tel Aviv","West Jerusalem","Haifa"));
        questionAnswerPairs.put("Italy", Arrays.asList("Rome","Milan","Naples","Florence"));
        questionAnswerPairs.put("Jamaica", Arrays.asList("Kingston","New Kingston","Spanish Town","Portmore"));
        questionAnswerPairs.put("Japan", Arrays.asList("Tokyo","Yokohama","Osaka","Nagoya"));
        questionAnswerPairs.put("Jordan", Arrays.asList("Amman","Zarqa","Irbid","Russeifa"));
        questionAnswerPairs.put("Kazakhstan", Arrays.asList("Astana","Almaty","Karagandy","Shymkent"));
        questionAnswerPairs.put("Kenya", Arrays.asList("Nairobi","Mombasa","Nakuru","Eldoret"));
        questionAnswerPairs.put("Kiribati", Arrays.asList("South Tarawa","Betio Village","Bikenibeu Village"));
        questionAnswerPairs.put("Kuwait", Arrays.asList("Kuwait City","Al Ahmadi","Hawalli","As Salimiyah"));
        questionAnswerPairs.put("Kyrgyzstan", Arrays.asList("Bishkek","Osh","Jalal-Abad","Karakol"));
        questionAnswerPairs.put("Laos", Arrays.asList("Vientiane","Pakse","Thakhek","Savannakhet"));
        questionAnswerPairs.put("Latvia", Arrays.asList("Riga","Daugavpils","Liepaja","Jelgava"));
        questionAnswerPairs.put("Lebanon", Arrays.asList("Beirut","Ra's Bayrut","Tripoli","Sidon"));
        questionAnswerPairs.put("Lesotho", Arrays.asList("Maseru","Mafeteng","Leribe","Maputsoe"));
        questionAnswerPairs.put("Liberia", Arrays.asList("Monrovia","Gbarnga","Kakata","Bensonville"));
        questionAnswerPairs.put("Libya", Arrays.asList("Tripoli","Benghazi","Misratah","Tarhuna"));
        questionAnswerPairs.put("Liechtenstein", Arrays.asList("Vaduz","Schaan","Triesen","Balzers"));
        questionAnswerPairs.put("Lithuania", Arrays.asList("Vilnius","Kaunas","Klaipeda","Siauliai"));
        questionAnswerPairs.put("Luxembourg", Arrays.asList("Luxembourg","Esch-sur-Alzette","Dudelange","Schifflange"));
        questionAnswerPairs.put("Madagascar", Arrays.asList("Antananarivo","Toamasina","Antsirabe","Fianarantsoa"));
        questionAnswerPairs.put("Malawi", Arrays.asList("Lilongwe","Blantyre","Mzuzu","Zomba"));
        questionAnswerPairs.put("Malaysia", Arrays.asList("Kuala Lumpur","Kota Bharu","Klang","Kampung Baru Subang"));
        questionAnswerPairs.put("Maldives", Arrays.asList("Malé","Fuvahmulah","Kithadhoo","Kulhudhuffushi"));
        questionAnswerPairs.put("Mali", Arrays.asList("Bamako","Sikasso","Mopti","Koutiala"));
        questionAnswerPairs.put("Malta", Arrays.asList("Valletta","Birkirara","Qormi","Mosta"));
        questionAnswerPairs.put("Marshall Islands", Arrays.asList("Majuro","Ebaye","Arno","Jabor"));
        questionAnswerPairs.put("Mauritania", Arrays.asList("Nouakchott","Nouadhibou","Nema","Kaedi"));
        questionAnswerPairs.put("Mauritius", Arrays.asList("Port Louis","Beau Bassin-Rose Hill","Vacoas","Curepipe"));
        questionAnswerPairs.put("Mexico", Arrays.asList("Mexico City","Iztapalapa","Ecatepec de Morelos","Guadalajara"));
        questionAnswerPairs.put("Micronesia", Arrays.asList("Palikir","Weno","Tofol","Colonia"));
        questionAnswerPairs.put("Moldova", Arrays.asList("Chișinău","Tiraspol","Balti","Bender"));
        questionAnswerPairs.put("Monaco", Arrays.asList("Monaco","Monte-Carlo","La Condamine"));
        questionAnswerPairs.put("Mongolia", Arrays.asList("Ulaanbaatar","Erdenet","Darhan","Khovd"));
        questionAnswerPairs.put("Montenegro", Arrays.asList("Podgorica","Niksic","Herceg-Novi","Pljevlja"));
        questionAnswerPairs.put("Morocco", Arrays.asList("Rabat","Casablanca","Rabat","Fes","Sale"));
        questionAnswerPairs.put("Mozambique", Arrays.asList("Maputo","Matola","Beira","Nampula"));
        questionAnswerPairs.put("Myanmar (formerly Burma)", Arrays.asList("Naypyidaw","Yagon","Mandalay","Nay Pyi Taw"));
        questionAnswerPairs.put("Namibia", Arrays.asList("Windhoek","Rundu","Walvis Bay","Oshakati"));
        questionAnswerPairs.put("Nauru", Arrays.asList("Yaren","Baiti","Anabar","Uaboe"));
        questionAnswerPairs.put("Nepal", Arrays.asList("Kathmandu","Pokhara","Patan","Biratnagar"));
        questionAnswerPairs.put("Netherlands", Arrays.asList("Amsterdam","Rotterdam","The Hague","Utrecht"));
        questionAnswerPairs.put("New Zealand", Arrays.asList("Wellington","Auckland","Christchurch","Manukau City"));
        questionAnswerPairs.put("Nicaragua", Arrays.asList("Managua","Leon","Masaya","Chinandega"));
        questionAnswerPairs.put("Niger", Arrays.asList("Niamey","Zinder","Maradi","Agadez"));
        questionAnswerPairs.put("Nigeria", Arrays.asList("Abuja","Lagos","Kano","Ibadan"));
        questionAnswerPairs.put("North Korea", Arrays.asList("Pyongyang","Hamhung","Namp'o","Sunch'on"));
        questionAnswerPairs.put("North Macedonia (formerly Macedonia)", Arrays.asList("Skopje","Bitola","Kumanovo","Prilep"));
        questionAnswerPairs.put("Norway", Arrays.asList("Oslo","Bergen","Trondheim","Stavanger"));
        questionAnswerPairs.put("Oman", Arrays.asList("Muscat","Seeb","Salalah","Bawshar"));
        questionAnswerPairs.put("Pakistan", Arrays.asList("Islamabad","Karachi","Lahore","Faisalabad"));
        questionAnswerPairs.put("Palau", Arrays.asList("Ngerulmud","Koror","Koror Town","Kloulklubed"));
        questionAnswerPairs.put("Palestine State", Arrays.asList("Ramallah","Gaza","Khan Yunis","Jabalya"));
        questionAnswerPairs.put("Panama", Arrays.asList("Panama City","San Miguelito","Juan Diaz","David"));
        questionAnswerPairs.put("Papua New Guinea", Arrays.asList("Port Moresby","Lae","Arawa","Mount Hagen"));
        questionAnswerPairs.put("Paraguay", Arrays.asList("Asunción","Ciudad del Este","San Lorenzo","Capiata"));
        questionAnswerPairs.put("Peru", Arrays.asList("Lima","Arequipa","Callao","Trujillo"));
        questionAnswerPairs.put("Philippines", Arrays.asList("Manila","Quezon City","Caloocan City","Budta"));
        questionAnswerPairs.put("Poland", Arrays.asList("Warsaw","Lodz","Krakow","Wroclaw"));
        questionAnswerPairs.put("Portugal", Arrays.asList("Lisbon","Porto","Amadora","Braga"));
        questionAnswerPairs.put("Qatar", Arrays.asList("Doha","Ar Rayyan","Umm Salal Muhammad","Al Wakrah"));
        questionAnswerPairs.put("Romania", Arrays.asList("Bucharest","Sector 3","Sector 6","Sector 1"));
        questionAnswerPairs.put("Russia", Arrays.asList("Moscow","Saint Petersburg","Novosikirsk","Yekaterinburg"));
        questionAnswerPairs.put("Rwanda", Arrays.asList("Kigali","Butare","Gitarama","Musanze"));
        questionAnswerPairs.put("Saint Kitts and Nevis", Arrays.asList("Basseterre","Fig Tree","Market Shop","Saint Paul's"));
        questionAnswerPairs.put("Saint Lucia", Arrays.asList("Castries","Bisee","Vieuz Fort","Micoud"));
        questionAnswerPairs.put("Saint Vincent and the Grenadines", Arrays.asList("Kingstown","Kingstown Park","Georgetown","Barrouallie"));
        questionAnswerPairs.put("Samoa", Arrays.asList("Apia","Asau","Mulifanua","Afega"));
        questionAnswerPairs.put("San Marino", Arrays.asList("San Marino","Serravalle","Borgo Maggiore","Domagnano"));
        questionAnswerPairs.put("Sao Tome and Principe", Arrays.asList("Sao Tome","Santo Antonio"));
        questionAnswerPairs.put("Saudi Arabia", Arrays.asList("Riyadh","Jeddah","Mecca","Medina"));
        questionAnswerPairs.put("Senegal", Arrays.asList("Dakar","Pikine","Touba","Thies"));
        questionAnswerPairs.put("Serbia", Arrays.asList("Belgrade","Nis","Novi Sad","Zemun"));
        questionAnswerPairs.put("Seychelles", Arrays.asList("Victoria","Anse Boileau","Bel Ombre","Beau Vallon"));
        questionAnswerPairs.put("Sierra Leone", Arrays.asList("Freetown","Bo","Kenema","Koidu"));
        questionAnswerPairs.put("Singapore", Arrays.asList("Singapore","Ulu Bedok","Bedok New Town","Jurong West"));
        questionAnswerPairs.put("Slovakia", Arrays.asList("Bratislava","Kosice","Presov","Nitra"));
        questionAnswerPairs.put("Slovenia", Arrays.asList("Ljubljana","Maribor","Celje","Kranj"));
        questionAnswerPairs.put("Solomon Islands", Arrays.asList("Honiara","Auki","Gizo","Buala"));
        questionAnswerPairs.put("Somalia", Arrays.asList("Mogadishu","Hargeysa","Berbera","Kismayo"));
        questionAnswerPairs.put("South Africa", Arrays.asList("Pretoria","Cape Town","Durban","Johannesburg"));
        questionAnswerPairs.put("South Korea", Arrays.asList("Seoul","Busan","Incheon","Daegu"));
        questionAnswerPairs.put("South Sudan", Arrays.asList("Juba","Winejok","Malakal","Wau"));
        questionAnswerPairs.put("Spain", Arrays.asList("Madrid","Barcelona","Valencia","Sevilla"));
        questionAnswerPairs.put("Sri Lanka", Arrays.asList("Sri Jayawardenepura Kotte","Colombo","Dehiwala-Mount-Lavinia","Moratuwa"));
        questionAnswerPairs.put("Sudan", Arrays.asList("Khartoum","Omdurman","Nyala","Port Sudan"));
        questionAnswerPairs.put("Suriname", Arrays.asList("Paramaribo","Lelydorp","Brokopondo","Nieuw Nickerie"));
        questionAnswerPairs.put("Sweden", Arrays.asList("Stockholm","Goeteborg","Malmoe","Uppsala"));
        questionAnswerPairs.put("Switzerland", Arrays.asList("Bern","Zurich","Geneva","Basel"));
        questionAnswerPairs.put("Syria", Arrays.asList("Damascus","Aleppo","Homs","Hamah"));
        questionAnswerPairs.put("Tajikistan", Arrays.asList("Dushanbe","Khujand","Kulob","Qurghonteppa"));
        questionAnswerPairs.put("Tanzania", Arrays.asList("Dodoma","Dar es Salaam","Mwanza","Arusha"));
        questionAnswerPairs.put("Thailand", Arrays.asList("Bangkok","Samut Prakan","Mueang Nonthaburi","Udon Thani"));
        questionAnswerPairs.put("Timor-Leste", Arrays.asList("Dili","Maliana","Suai","Likisa"));
        questionAnswerPairs.put("Togo", Arrays.asList("Lome","Sokode","Kara","Atakpame"));
        questionAnswerPairs.put("Tonga", Arrays.asList("Nukuʻalofa","Neiafu","Pangai","'Ohonua"));
        questionAnswerPairs.put("Trinidad and Tobago", Arrays.asList("Port of Spain","Chaguanas","Mon Repos","San Fernando"));
        questionAnswerPairs.put("Tunisia", Arrays.asList("Tunis","Sfax","Sousse","Kairouan"));
        questionAnswerPairs.put("Turkey", Arrays.asList("Ankara","Istanbul","Izmir","Bursa"));
        questionAnswerPairs.put("Turkmenistan", Arrays.asList("Ashgabat","Turkmenabat","Dasoguz","Mary"));
        questionAnswerPairs.put("Tuvalu", Arrays.asList("Funafuti","Savave Village","Tanrake","Toga"));
        questionAnswerPairs.put("Uganda", Arrays.asList("Kampala","Gulu","Lira","Mbarara"));
        questionAnswerPairs.put("Ukraine", Arrays.asList("Kyiv","Kharkiv","Dnipro","Donetsk"));
        questionAnswerPairs.put("United Arab Emirates", Arrays.asList("Abu Dhabi","Dubai","Sharjah","Al Ain"));
        questionAnswerPairs.put("United Kingdom", Arrays.asList("London","Birmingham","Liverpool","Nottingham"));
        questionAnswerPairs.put("United States", Arrays.asList("Washington, D.C.","New York","Los Angeles","Chicago"));
        questionAnswerPairs.put("Uruguay", Arrays.asList("Montevideo","Salto","Paysandu","Las Piedras"));
        questionAnswerPairs.put("Uzbekistan", Arrays.asList("Tashkent","Namangan","Samarkand","Andijon"));
        questionAnswerPairs.put("Vanuatu", Arrays.asList("Port Vila","Luganville","Isangel","Sola"));
        questionAnswerPairs.put("Venezuela", Arrays.asList("Caracas","Maracaibo","Maracay","Valencia"));
        questionAnswerPairs.put("Vietnam", Arrays.asList("Hanoi","Ho Chi Minh City","Da Nang","Haiphong"));
        questionAnswerPairs.put("Yemen", Arrays.asList("Sana'a","Al Hudaydah","Ta'izz","Aden"));
        questionAnswerPairs.put("Zambia", Arrays.asList("Lusaka","Kitwe","Ndola","Kabwe"));
        questionAnswerPairs.put("Zimbabwe", Arrays.asList("Harare","Bulawayo","Chitungwiza","Mutare"));

    }
    public void getOptions(String country){
        //final String correctAnswer=questionAnswerPairs.get(country).get(0);

        List<String> shuffledOptions=new ArrayList<>(questionAnswerPairs.get(country));

        Collections.shuffle(shuffledOptions);

        char index='a';

        for(int i=0; i<shuffledOptions.size(); i++) {
            System.out.println((index) + ". " + shuffledOptions.get(i));
            index++;
        }

    }
    public String getRandomCountry() {
        List<String> keys = new ArrayList<>(questionAnswerPairs.keySet());
        Random random = new Random();
        return keys.get(random.nextInt(keys.size()));
    }

    public boolean checkAnswer(String country, String userAnswer) {
        String correctAnswer = questionAnswerPairs.get(country).get(0);
        return correctAnswer != null && correctAnswer.equalsIgnoreCase(userAnswer.trim());
    }


}
