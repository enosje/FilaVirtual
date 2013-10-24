package br.com.filavirtual.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.filavirtual.entities.Usuario;

@Controller
public class LoginController {

	@RequestMapping("efetuaLogin")
	public String efetuaLogin(Usuario usuario, HttpSession session) {
//	  if(new JdbcUsuarioDao().existeUsuario(usuario)) {
	    session.setAttribute("usuarioLogado", usuario);
	    return "menu";
//	  }
//	  return "redirect:/";
	}
	@RequestMapping("logout")
	public String efetuaLogin(HttpSession session) {
//	
			session.invalidate();
		
	  return "redirect:/";
	}
	
}
