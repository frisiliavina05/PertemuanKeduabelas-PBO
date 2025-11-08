package DataMusik;

import DataMusik.Musik;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-07T11:24:06", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Album.class)
public class Album_ { 

    public static volatile SingularAttribute<Album, String> namaAlbum;
    public static volatile SingularAttribute<Album, String> genre;
    public static volatile SingularAttribute<Album, Integer> tahunRilis;
    public static volatile CollectionAttribute<Album, Musik> musikCollection;
    public static volatile SingularAttribute<Album, String> idAlbum;

}