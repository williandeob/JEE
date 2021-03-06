package financeiro.web;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "usuarioBean")
@RequestScoped
public class UsuarioBean {
	private String nome, email, senha, confirmaSenha;

	public String novo() {
		return "usuario";
	}

	public String salvar() {
		FacesContext context = FacesContext.getCurrentInstance();
		if (!this.senha.equalsIgnoreCase(confirmaSenha)) {
			context.addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_ERROR, "Senha Confirmada Incorreta",
					""));
			return "usuario";
		}
		// persiste usuario no banco

		return "mostrarUsuario";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

}
