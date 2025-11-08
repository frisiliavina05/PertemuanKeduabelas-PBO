package DataMusik;

import DataMusik.Album;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-07T11:24:06", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Musik.class)
public class Musik_ { 

    public static volatile SingularAttribute<Musik, String> artis;
    public static volatile SingularAttribute<Musik, String> idMusik;
    public static volatile SingularAttribute<Musik, Integer> tahun;
    public static volatile SingularAttribute<Musik, String> judul;
    public static volatile SingularAttribute<Musik, Album> idAlbum;

}