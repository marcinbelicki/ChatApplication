package ram.tech.brain.ChatApplication;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatEndpoint {

    @MessageMapping("/user1")
    @SendTo("/sample/publish2")
    public String publishMessage1(String message){
        return message;
    }
    @MessageMapping("/user2")
    @SendTo("/sample/publish1")
    public String publishMessage2(String message){
        return message;
    }
}
