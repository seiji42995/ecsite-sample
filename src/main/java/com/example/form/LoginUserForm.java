package com.example.form;

import jakarta.validation.constraints.NotBlank;

public class LoginUserForm {

	/** メールアドレス */
	@NotBlank(message="メールアドレスを入力してください")
	private String email;
	/** パスワード */
	@NotBlank(message="パスワードを入力してください")
	private String password;

	@Override
	public String toString() {
		return "LoginUserForm [email=" + email + ", password=" + password + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
