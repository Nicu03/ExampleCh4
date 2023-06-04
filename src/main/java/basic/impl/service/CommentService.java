package basic.impl.service;

import basic.impl.proxies.CommentNotificationProxy;
import basic.impl.pojo.Comment;
import basic.impl.repositories.CommentRepository;

public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotification;

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
