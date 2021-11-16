package jp.co.sample.emp_management.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 */
public class InsertAdministratorForm {
	// 名前 空欄NG
	@NotBlank(message = "名前を入力してください")
	private String name;
	
	// メールアドレス 空欄NG・メールアドレスの形式で
	@NotBlank(message = "メールアドレスを入力してください")
	@Email(message = "メールアドレスの形式ではありません")
	private String mailAddress;
	
	// パスワード　空欄NG・8文字以上・英数字のみOK
	@NotBlank(message = "パスワードを入力してください")
	@Size(min=8,message="8文字以上で入力してください")
	@Pattern(regexp="/^[0-9a-zA-Z]*$/",message="パスワードは半角英数字で入力してください")
	private String password;
	
	
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mailAddress
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * @param mailAddress the mailAddress to set
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ "]";
	}

}
