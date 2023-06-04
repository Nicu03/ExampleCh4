package spring.impl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.impl.pojo.Comment;
import spring.impl.proxies.CommentNotificationProxy;
import spring.impl.repositories.CommentRepository;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotification;

    @Autowired
    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotification) {
        this.commentRepository = commentRepository;
        this.commentNotification = commentNotification;
    }

    public void publishComment(Comment comment){
        System.out.println(comment.toString());
        commentRepository.storeComment(comment);
        commentNotification.sendComment(comment);
    }
}
