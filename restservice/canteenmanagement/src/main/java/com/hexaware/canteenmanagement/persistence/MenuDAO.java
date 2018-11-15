package com.hexaware.canteenmanagement.persistence;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.canteenmanagement.model.Menu;
public interface MenuDAO {
    @SqlQuery("Select * from Menu")
    @Mapper(MenuMapper.class)
    List<Menu> show();

    @SqlQuery("select * from Menu where food_id = :foodId")
    @Mapper(MenuMapper.class)
    Menu findByFoodId(@Bind("foodId") int foodId);

    @SqlUpdate("insert into Menu (food_name, quantity, price) values (:fName, :fQuan, :fPrice)")
    void add(@Bind("fName") String fName, @Bind("fQuan") int fQuan, @Bind("fPrice") int fPrice);
}