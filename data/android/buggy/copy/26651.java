@org.springframework.data.jpa.repository.Query(value = "select new com.softserveinc.edu.boardgames.persistence.entity.dto.GameDetailsDTO" + (("(g.name, gr.rating, 0.0) " + "from Game g, GameRating gr ") + "where g.id = :gameId and gr.game.id = g.id and gr.user.id = :userId"))
public com.softserveinc.edu.boardgames.persistence.entity.dto.GameDetailsDTO getGameDetails(@org.springframework.data.repository.query.Param(value = "gameId")
java.lang.Integer gameId, @org.springframework.data.repository.query.Param(value = "userId")
java.lang.Integer userId);