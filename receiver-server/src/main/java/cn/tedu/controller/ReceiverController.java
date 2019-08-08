package cn.tedu.controller;

import cn.tedu.service.ReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ReceiverController {
    @Autowired
    private ReceiverService receiverService;

}
