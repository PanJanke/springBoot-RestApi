package pl.PanJanke.rest.webservices.restfullwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.PanJanke.rest.webservices.restfullwebservices.user.Post;
import pl.PanJanke.rest.webservices.restfullwebservices.user.User;

public interface PostRepository extends JpaRepository<Post,Integer> {

}
