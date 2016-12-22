package ru.vguit.tutorial.persistens;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-22T18:21:07")
@StaticMetamodel(Books.class)
public class Books_ { 

    public static volatile SingularAttribute<Books, Integer> year;
    public static volatile SingularAttribute<Books, String> author;
    public static volatile SingularAttribute<Books, String> name;
    public static volatile SingularAttribute<Books, Long> id;
    public static volatile SingularAttribute<Books, String> publishing;

}