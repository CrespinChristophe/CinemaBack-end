/*package be.technifutur.utils;


import be.technifutur.data.UserRepository;
import be.technifutur.model.entities.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseFiller implements InitializingBean {

    private UserRepository repository;

    @Override
    public void afterPropertiesSet() throws Exception {
        setupUser();
    }

    private void setupUser() {

        User u = User.builder()
                .id(1L)
                .nom("Crespin")
                .prenom("Christophe")
                .adresse("rue des gagnants")
                .dateNaissance("74/08/09")
                .numeroTel("044656565")
                .email("turlututu@chapeaupointu")
                .build();

        repository.save(u);

        u = User.builder()
                .id(1L)
                .nom("Malo")
                .prenom("Laurence")
                .adresse("rue des malo")
                .dateNaissance("75/08/09")
                .numeroTel("044546565")
                .email("turlututu@chapeaupointu")
                .build();

        u = User.builder()
                .id(1L)
                .nom("Crespin")
                .prenom("Alphonse")
                .adresse("rue des stappes")
                .dateNaissance("29/08/09")
                .numeroTel("044586565")
                .email("turlututu@chapeaupointu")
                .build();

        u = User.builder()
                .id(1L)
                .nom("Torvalds")
                .prenom("Linus")
                .adresse("rue des génies")
                .dateNaissance("69/08/09")
                .numeroTel("044856565")
                .email("turlututu@chapeaupointu")
                .build();


    }
}*/
