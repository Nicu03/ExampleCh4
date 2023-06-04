package spring.impl.proxies;

import org.springframework.stereotype.Component;
import spring.impl.pojo.Comment;

@Component
public class CommentPushNotificationProxy
  implements CommentNotificationProxy {
 
  @Override
  public void sendComment(Comment comment) {
    System.out.println(
      "Sending push notification for comment: " 
          + comment.toString());
  }
}