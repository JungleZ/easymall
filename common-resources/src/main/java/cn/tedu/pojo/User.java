package cn.tedu.pojo;

import java.util.Date;

/**
 * 用户
 */
public class User {
    private Long id;

    private String name;

    private String gender;

    private Date birthday;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String img;

    private String phone;

    /**
     * 随机盐值
     */
    private String salt;

    private String username;

    private String password;

    /**
     * 积分
     */
    private Integer points;

    /**
     * 钱包
     */
    private Integer purse;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    /**
     * 默认地址
     */
    private String defaultReceiver;

    /**
     * 关联会员
     */
    private Integer memberId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getPurse() {
        return purse;
    }

    public void setPurse(Integer purse) {
        this.purse = purse;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getDefaultReceiver() {
        return defaultReceiver;
    }

    public void setDefaultReceiver(String defaultReceiver) {
        this.defaultReceiver = defaultReceiver == null ? null : defaultReceiver.trim();
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }
}