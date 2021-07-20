package hello.game.Entity;

import hello.game.Enum.MemberShip;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String name;
    private String location;
    private Long amountOfBen;
    private Long amountOfLike;
    private Long amountOfPurchase;
    private MemberShip memberShip;


    public User(MemberShip memberShip) {
        this.memberShip = memberShip;
    }

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
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getAmountOfBen() {
        return amountOfBen;
    }

    public void setAmountOfBen(Long amountOfBen) {
        this.amountOfBen = amountOfBen;
    }

    public Long getAmountOfLike() {
        return amountOfLike;
    }

    public void setAmountOfLike(Long amountOfLike) {
        this.amountOfLike = amountOfLike;
    }

    public Long getAmountOfPurchase() {
        return amountOfPurchase;
    }

    public void setAmountOfPurchase(Long amountOfPurchase) {
        this.amountOfPurchase = amountOfPurchase;
    }

    public MemberShip getMemberShip() {
        return memberShip;
    }

    public void setMemberShip(MemberShip memberShip) {
        this.memberShip = memberShip;
    }
}
