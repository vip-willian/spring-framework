package org.springframework.willian.circular.reference;

import lombok.Data;

/**
 * @author <a href="mailto:wangyan@cai-inc.com">沐风</a>
 * @datetime 2024-06-19 17:34:25
 */
@Data
public class IdCardObj {

	/**
	 * 身份证号
	 */
	private String idCard;
	/**
	 * 所属用户
	 */
	private UserObj user;

	@Override
	public String toString() {

		return "IdCardObj{" + "idCard='" + getIdCard() + "', userName='" + getUser().getUserName() + "', age=" + getUser().getAge() + "}";
	}
}
