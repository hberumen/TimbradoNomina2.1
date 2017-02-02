import me.hberumen.nomina.bd.mappers.NominaMapper;

public enum TipoTest {

    LOCAL {
        public NominaMapper getMapper(){
            return new ImplNominaMapperTest();
        }
    },
    BASE_DATOS{
        public NominaMapper getMapper(){
            return new ImplNominaMapperDbTest();
        }
    };

    public abstract NominaMapper getMapper();
}



