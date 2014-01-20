package video.model;

import video.model.enums.MovieType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "director", nullable = false)
    private Director director;

    @Column(name = "premiere")
    private Date premiere;

    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    private MovieType type;

    @Column(name = "reserved")
    private boolean reserved;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "reserved_by")
    private Client client;

    @Column(name = "reservation_expires")
    private Date reservationExpires;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "director", nullable = false)
    private List<Actor> actorsPlaying = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Date getPremiere() {
        return premiere;
    }

    public void setPremiere(Date premiere) {
        this.premiere = premiere;
    }

    public MovieType getType() {
        return type;
    }

    public void setType(MovieType type) {
        this.type = type;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getReservationExpires() {
        return reservationExpires;
    }

    public void setReservationExpires(Date reservationExpires) {
        this.reservationExpires = reservationExpires;
    }
}
