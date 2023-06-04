package spring.impl.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.impl.config.ProjectConfig;
import spring.impl.pojo.Comment;
import spring.impl.proxies.EmailCommentNotification;
import spring.impl.repositories.DBCommentRepository;
import spring.impl.service.CommentService;

public class Main {
  public static void main(String[] args) {

    var comment = new Comment("Laurentiu","Demo comment");
    var context = new AnnotationConfigApplicationContext
            (ProjectConfig.class);
    context.getBean(CommentService.class).publishComment(comment);

  }
}