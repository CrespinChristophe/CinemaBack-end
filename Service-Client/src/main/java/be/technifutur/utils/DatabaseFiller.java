package be.technifutur.utils;


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
                .build()
                .id(1L)
                .nom("Crespin")
                .prenom("Christophe")
                .adresse("rue des gagnants")


    }
}
