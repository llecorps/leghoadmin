package ch.rts.si.micro.legho.clientui.controller;

import ch.rts.si.micro.legho.clientui.dao.ListuserDao;
import ch.rts.si.micro.legho.clientui.model.Listuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    ListuserDao listuserDao;

    @RequestMapping("/")
    public String index(Model model)
    {

        return "index";

    }

    @RequestMapping("/listuser")
    public String listuser(Model model)
    {
        List<Listuser> listusers = listuserDao.findAll();
        model.addAttribute( "listusers", listusers );
        return "listuser";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
