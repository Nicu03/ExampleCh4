package basic.impl.main;

import basic.impl.pojo.Comment;
import basic.impl.proxies.EmailCommentNotification;
import basic.impl.repositories.DBCommentRepository;
import basic.impl.service.CommentService;

public class Main {
  public static void main(String[] args) {
    var commentRepository =
      new DBCommentRepository();
    var commentNotificationProxy =
      new EmailCommentNotification();

    var commentService =
      new CommentService(
          commentRepository, commentNotificationProxy);

    var comment = new Comment("Laurentiu","Demo comment");

    commentService.publishComment(comment);
  }
}