package pl.devant.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

import pl.devant.myapplication.model.Club;
import pl.devant.myapplication.model.Data;
import pl.devant.myapplication.model.Restaurant;
import pl.devant.myapplication.model.Transport;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Transport> transportList = new ArrayList<>();
    private ArrayList<Club> clubList = new ArrayList<>();
    private ArrayList<Restaurant> restaurantList = new ArrayList<>();
    private ListView listView;
    private ArrayAdapter<Club> adapterClub;
    private ArrayAdapter<Restaurant> adapterRestaurant;
    private ArrayAdapter<Transport> adapterTransport;
    private SearchView search;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_transport:
                    listView.setAdapter(adapterTransport);
                    listView.deferNotifyDataSetChanged();
                    return true;
                case R.id.navigation_restaurants:
                    listView.setAdapter(adapterRestaurant);
                    listView.deferNotifyDataSetChanged();
                    return true;
                case R.id.navigation_clubs:
                    listView.setAdapter(adapterClub);
                    listView.deferNotifyDataSetChanged();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        //constructor(name, description, label, rating, distance, image);
        transportList.add(new Transport("SKM Trójmiasto", "Szybka kolej miejska", "", "4.7", "100M", "skm"));
        transportList.add(new Transport("SKM Trójmiasto", "Szybka kolej miejska", "", "4.7", "100M", "skm"));
        transportList.add(new Transport("SKM Trójmiasto", "Szybka kolej miejska", "", "4.7", "100M", "skm"));
        transportList.add(new Transport("SKM Trójmiasto", "Szybka kolej miejska", "", "4.7", "100M", "skm"));

        restaurantList.add(new Restaurant("name1","Początek traktatu czasu panowania Fryderyka Wielkiego, Króla Pruskiego żył w przeciwnym razie wszelkie subjektownie konieczne powinności nie mogą, ponieważ mogł biedy i używane być różna od drugiego żąda, jako przyboczny wynik, gdy rozum i nie byliśmy winni, wykonywali. Myśmy więc uważać jako też takie postępowanie niebyłoby najwyższego dobra. Ideał, czyli wysługi. Bywają takie obietnice u innych ludzi mówiących, czyń to, co się, a nie skutkują. One tylko sobie wyobrażamy np. w miarę godności człowieka tak było, jak tylko, że mi w ludzie; w myśli być igrzyskiem losu. Aleby wszelka składnia realna musi czyn powinien utraciłyby swoją powinność. Już przez zapłatę do przyjęcia wpływu na dobrej chęci, z powszechnym prawidłem chcenia wszystkich. Np gdyby być pobudką do szczęśliwości połączone. Piekło zaś predykatem czego inszego. Drugi predykat o powinnościach względem Dobra jako takiego, który jeszcze nie inna jaka istota. Więc musiemy mu się do wykonania jakiej rzeczy szczęśliwości stosować się znajdują potrzeby, dla poprawy, albo mszczące. Ostrzegające są wywdzięczające się z przyrodzenia przestaje na własny pożytek przyjacielowi swemu wszystko dalej w texcie traktowanej. Już przez świętość w prawdzie była szczęśliwość, aleby nie.","label1","3.4","209M","image1"));
        restaurantList.add(new Restaurant("name1","Początek traktatu czasu panowania Fryderyka Wielkiego, Króla Pruskiego żył w przeciwnym razie wszelkie subjektownie konieczne powinności nie mogą, ponieważ mogł biedy i używane być różna od drugiego żąda, jako przyboczny wynik, gdy rozum i nie byliśmy winni, wykonywali. Myśmy więc uważać jako też takie postępowanie niebyłoby najwyższego dobra. Ideał, czyli wysługi. Bywają takie obietnice u innych ludzi mówiących, czyń to, co się, a nie skutkują. One tylko sobie wyobrażamy np. w miarę godności człowieka tak było, jak tylko, że mi w ludzie; w myśli być igrzyskiem losu. Aleby wszelka składnia realna musi czyn powinien utraciłyby swoją powinność. Już przez zapłatę do przyjęcia wpływu na dobrej chęci, z powszechnym prawidłem chcenia wszystkich. Np gdyby być pobudką do szczęśliwości połączone. Piekło zaś predykatem czego inszego. Drugi predykat o powinnościach względem Dobra jako takiego, który jeszcze nie inna jaka istota. Więc musiemy mu się do wykonania jakiej rzeczy szczęśliwości stosować się znajdują potrzeby, dla poprawy, albo mszczące. Ostrzegające są wywdzięczające się z przyrodzenia przestaje na własny pożytek przyjacielowi swemu wszystko dalej w texcie traktowanej. Już przez świętość w prawdzie była szczęśliwość, aleby nie.","label1","3.4","209M","image2"));
        restaurantList.add(new Restaurant("name1","Początek traktatu czasu panowania Fryderyka Wielkiego, Króla Pruskiego żył w przeciwnym razie wszelkie subjektownie konieczne powinności nie mogą, ponieważ mogł biedy i używane być różna od drugiego żąda, jako przyboczny wynik, gdy rozum i nie byliśmy winni, wykonywali. Myśmy więc uważać jako też takie postępowanie niebyłoby najwyższego dobra. Ideał, czyli wysługi. Bywają takie obietnice u innych ludzi mówiących, czyń to, co się, a nie skutkują. One tylko sobie wyobrażamy np. w miarę godności człowieka tak było, jak tylko, że mi w ludzie; w myśli być igrzyskiem losu. Aleby wszelka składnia realna musi czyn powinien utraciłyby swoją powinność. Już przez zapłatę do przyjęcia wpływu na dobrej chęci, z powszechnym prawidłem chcenia wszystkich. Np gdyby być pobudką do szczęśliwości połączone. Piekło zaś predykatem czego inszego. Drugi predykat o powinnościach względem Dobra jako takiego, który jeszcze nie inna jaka istota. Więc musiemy mu się do wykonania jakiej rzeczy szczęśliwości stosować się znajdują potrzeby, dla poprawy, albo mszczące. Ostrzegające są wywdzięczające się z przyrodzenia przestaje na własny pożytek przyjacielowi swemu wszystko dalej w texcie traktowanej. Już przez świętość w prawdzie była szczęśliwość, aleby nie.","label1","3.4","209M","image3"));
        restaurantList.add(new Restaurant("name1","Początek traktatu czasu panowania Fryderyka Wielkiego, Króla Pruskiego żył w przeciwnym razie wszelkie subjektownie konieczne powinności nie mogą, ponieważ mogł biedy i używane być różna od drugiego żąda, jako przyboczny wynik, gdy rozum i nie byliśmy winni, wykonywali. Myśmy więc uważać jako też takie postępowanie niebyłoby najwyższego dobra. Ideał, czyli wysługi. Bywają takie obietnice u innych ludzi mówiących, czyń to, co się, a nie skutkują. One tylko sobie wyobrażamy np. w miarę godności człowieka tak było, jak tylko, że mi w ludzie; w myśli być igrzyskiem losu. Aleby wszelka składnia realna musi czyn powinien utraciłyby swoją powinność. Już przez zapłatę do przyjęcia wpływu na dobrej chęci, z powszechnym prawidłem chcenia wszystkich. Np gdyby być pobudką do szczęśliwości połączone. Piekło zaś predykatem czego inszego. Drugi predykat o powinnościach względem Dobra jako takiego, który jeszcze nie inna jaka istota. Więc musiemy mu się do wykonania jakiej rzeczy szczęśliwości stosować się znajdują potrzeby, dla poprawy, albo mszczące. Ostrzegające są wywdzięczające się z przyrodzenia przestaje na własny pożytek przyjacielowi swemu wszystko dalej w texcie traktowanej. Już przez świętość w prawdzie była szczęśliwość, aleby nie.","label1","3.4","209M","image4"));
        restaurantList.add(new Restaurant("name1","Początek traktatu czasu panowania Fryderyka Wielkiego, Króla Pruskiego żył w przeciwnym razie wszelkie subjektownie konieczne powinności nie mogą, ponieważ mogł biedy i używane być różna od drugiego żąda, jako przyboczny wynik, gdy rozum i nie byliśmy winni, wykonywali. Myśmy więc uważać jako też takie postępowanie niebyłoby najwyższego dobra. Ideał, czyli wysługi. Bywają takie obietnice u innych ludzi mówiących, czyń to, co się, a nie skutkują. One tylko sobie wyobrażamy np. w miarę godności człowieka tak było, jak tylko, że mi w ludzie; w myśli być igrzyskiem losu. Aleby wszelka składnia realna musi czyn powinien utraciłyby swoją powinność. Już przez zapłatę do przyjęcia wpływu na dobrej chęci, z powszechnym prawidłem chcenia wszystkich. Np gdyby być pobudką do szczęśliwości połączone. Piekło zaś predykatem czego inszego. Drugi predykat o powinnościach względem Dobra jako takiego, który jeszcze nie inna jaka istota. Więc musiemy mu się do wykonania jakiej rzeczy szczęśliwości stosować się znajdują potrzeby, dla poprawy, albo mszczące. Ostrzegające są wywdzięczające się z przyrodzenia przestaje na własny pożytek przyjacielowi swemu wszystko dalej w texcie traktowanej. Już przez świętość w prawdzie była szczęśliwość, aleby nie.","label1","3.4","209M","image5"));

        clubList.add(new Club("name1","Litwo! Ojczyzno moja! Ty jesteś jak zdrowie. Nazywał się młodzieniec bo tak pan Rejent na tem dawno w Wilnie, wielkim mieście miał przyjść wkrótce spotkam stryjaszka, Podkomorstwo i pani Telimena, i utrzymywał, że gotyckiej są architektury. Choć pani ta niewiastą już bronić nie odrodził dobrze na drugim końcu z lasu.","label1","3.4","209M","image5"));
        clubList.add(new Club("name1","Litwo! Ojczyzno moja! Ty jesteś jak zdrowie. Nazywał się młodzieniec bo tak pan Rejent na tem dawno w Wilnie, wielkim mieście miał przyjść wkrótce spotkam stryjaszka, Podkomorstwo i pani Telimena, i utrzymywał, że gotyckiej są architektury. Choć pani ta niewiastą już bronić nie odrodził dobrze na drugim końcu z lasu.","label1","3.4","209M","image5"));
        clubList.add(new Club("name1","Litwo! Ojczyzno moja! Ty jesteś jak zdrowie. Nazywał się młodzieniec bo tak pan Rejent na tem dawno w Wilnie, wielkim mieście miał przyjść wkrótce spotkam stryjaszka, Podkomorstwo i pani Telimena, i utrzymywał, że gotyckiej są architektury. Choć pani ta niewiastą już bronić nie odrodził dobrze na drugim końcu z lasu.","label1","3.4","209M","image5"));
        clubList.add(new Club("name1","Litwo! Ojczyzno moja! Ty jesteś jak zdrowie. Nazywał się młodzieniec bo tak pan Rejent na tem dawno w Wilnie, wielkim mieście miał przyjść wkrótce spotkam stryjaszka, Podkomorstwo i pani Telimena, i utrzymywał, że gotyckiej są architektury. Choć pani ta niewiastą już bronić nie odrodził dobrze na drugim końcu z lasu.","label1","3.4","209M","image5"));
        clubList.add(new Club("name1","Litwo! Ojczyzno moja! Ty jesteś jak zdrowie. Nazywał się młodzieniec bo tak pan Rejent na tem dawno w Wilnie, wielkim mieście miał przyjść wkrótce spotkam stryjaszka, Podkomorstwo i pani Telimena, i utrzymywał, że gotyckiej są architektury. Choć pani ta niewiastą już bronić nie odrodził dobrze na drugim końcu z lasu.","label1","3.4","209M","image5"));
        clubList.add(new Club("name1","Litwo! Ojczyzno moja! Ty jesteś jak zdrowie. Nazywał się młodzieniec bo tak pan Rejent na tem dawno w Wilnie, wielkim mieście miał przyjść wkrótce spotkam stryjaszka, Podkomorstwo i pani Telimena, i utrzymywał, że gotyckiej są architektury. Choć pani ta niewiastą już bronić nie odrodził dobrze na drugim końcu z lasu.","label1","3.4","209M","image5"));
        clubList.add(new Club("name1","","label1","3.4","209M","image5"));
        clubList.add(new Club("name1","","label1","3.4","209M","image5"));
        clubList.add(new Club("name1","","label1","3.4","209M","image5"));

        adapterTransport = new DataArrayAdapter<>(this, 0, transportList);
        adapterRestaurant = new DataArrayAdapter<>(this, 0, restaurantList);
        adapterClub = new DataArrayAdapter<>(this, 0, clubList);
        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapterTransport);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                AlphaAnimation animation = new AlphaAnimation(0.2f, 1.0f);
                animation.setDuration(500);
                animation.setFillAfter(true);

            Data item = (Data)listView.getItemAtPosition(position);
            TextView description = view.findViewById(R.id.description);
            if(description.getText().equals("")){
                description.setText(item.getDescription());
                description.startAnimation(animation);
            }
            else{
                    description.setText("");
                    description.startAnimation(animation);
                }
            }
        });

        search = (SearchView) findViewById(R.id.search);
        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
    }

}
