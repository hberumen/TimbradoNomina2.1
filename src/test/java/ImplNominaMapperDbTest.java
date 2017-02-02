import me.hberumen.nomina.bd.config.SqlConfig;
import me.hberumen.nomina.bd.mappers.NominaMapper;
import me.hberumen.nomina.modelo.*;
import me.hberumen.nomina.modelo.jtd.*;
import org.apache.ibatis.session.SqlSession;
import java.math.BigInteger;
import java.util.List;

/**
 * Created by hberumen on 01/02/17.
 */
public class ImplNominaMapperDbTest implements NominaMapper {

    private SqlSession sesion;
    private NominaMapper mapper;


    @Override
    public List<ComprobanteDb> seleccionarComprobantePorAgrupa(BigInteger agrupa) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        List<ComprobanteDb> comprobantes = mapper.seleccionarComprobantePorAgrupa(agrupa);
        sesion.close();

        return comprobantes;
    }

    @Override
    public NominaDb getNominaFromIdComprobante(BigInteger idComprobante) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        NominaDb nomina = mapper.getNominaFromIdComprobante(idComprobante);
        sesion.close();

        return nomina;
    }

    @Override
    public EmisorDb getEmisorActivo() {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        EmisorDb emisorDb = mapper.getEmisorActivo();
        sesion.close();

        return emisorDb;
    }

    @Override
    public EmisorDb getEmisorActivoNomina() {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        EmisorDb emisorDb = mapper.getEmisorActivoNomina();
        sesion.close();

        return emisorDb;

    }

    @Override
    public RegimenFiscal getRegimenFiscalPorIdEmisor(int idEmisor) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        RegimenFiscal regimenFiscalDb = mapper.getRegimenFiscalPorIdEmisor(idEmisor);
        sesion.close();

        return regimenFiscalDb;

    }

    @Override
    public ReceptorDb getReceptorPorIdComprobante(BigInteger idComprobante) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        ReceptorDb receptorDb  = mapper.getReceptorPorIdComprobante(idComprobante);
        sesion.close();

        return receptorDb;

    }

    @Override
    public ReceptorDb getReceptorPorIdComprobanteNomina(BigInteger idComprobante) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        ReceptorDb receptorDb  = mapper.getReceptorPorIdComprobanteNomina(idComprobante);
                sesion.close();

        return receptorDb;

    }

    @Override
    public Concepto seleccionarConceptosPorIdComprobante() {

        return Concepto.builder();

    }

    @Override
    public EntidadSNFCDb seleccionarEntidadSNFCPorIdNomina(BigInteger idNomina) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        EntidadSNFCDb entidadSNFCDb = mapper.seleccionarEntidadSNFCPorIdNomina(idNomina);
        sesion.close();

        return entidadSNFCDb;

    }

    @Override
    public SubContratacionDb seleccionarSubContratacionPorIdNomina(BigInteger idNomina) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        SubContratacionDb subContratacion = mapper.seleccionarSubContratacionPorIdNomina(idNomina);
        sesion.close();

        return subContratacion;

    }

    @Override
    public PercepcionesDb seleccionarPercepcionesPorIdNomina(BigInteger idNomina) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        PercepcionesDb percepcionesDb = mapper.seleccionarPercepcionesPorIdNomina(idNomina);
        sesion.close();

        return percepcionesDb;

    }

    @Override
    public List<PercepcionDb> seleccionarPercepcionPorIdPercepciones(BigInteger idPercepcion) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        List<PercepcionDb> percepcionDbs = mapper.seleccionarPercepcionPorIdPercepciones(idPercepcion);
        sesion.close();

        return percepcionDbs;

    }

    @Override
    public AccionesOTitulosDb selecionarAccionesOTitulosPorIdNomina(BigInteger idNomina) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        AccionesOTitulosDb accionesOTitulosDb = mapper.selecionarAccionesOTitulosPorIdNomina(idNomina);
        sesion.close();

        return accionesOTitulosDb;

    }

    @Override
    public HorasExtraDb seleccionarHorasExtraPorIdNomina(BigInteger idNomina) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        HorasExtraDb horasExtraDb = mapper.seleccionarHorasExtraPorIdNomina(idNomina);
        sesion.close();

        return horasExtraDb;

    }

    @Override
    public JubilacionPensionRetiroDb seleccionarJubilacionPensionRetiroPorIdNomina(BigInteger idNomina) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        JubilacionPensionRetiroDb jubilacionPensionRetiroDb = mapper.seleccionarJubilacionPensionRetiroPorIdNomina(idNomina);
        sesion.close();

        return jubilacionPensionRetiroDb;

    }

    @Override
    public SeparacionIndemnizacionDb seleccionarSeparacionIndemnizacionPorIdNomina(BigInteger idNomina) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        SeparacionIndemnizacionDb separacionIndemnizacionDb = mapper.seleccionarSeparacionIndemnizacionPorIdNomina(idNomina);
        sesion.close();

        return separacionIndemnizacionDb;

    }

    @Override
    public DeduccionesDb seleccionarDeduccionesPorIdNomina(BigInteger idNomina) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        DeduccionesDb deduccionesDb = mapper.seleccionarDeduccionesPorIdNomina(idNomina);
        sesion.close();

        return deduccionesDb;

    }

    @Override
    public List<DeduccionDb> seleccionarDeduccionPorIdDeducciones(BigInteger idDeducciones) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        List<DeduccionDb>  deduccionDbs = mapper.seleccionarDeduccionPorIdDeducciones(idDeducciones);
        sesion.close();

        return deduccionDbs;

    }

    @Override
    public IncapacidadDb seleccionarIncapacidadPorIdNomina(BigInteger idNomina) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        IncapacidadDb incapacidadDb = mapper.seleccionarIncapacidadPorIdNomina(idNomina);
        sesion.close();

        return incapacidadDb;

    }

    @Override
    public OtroPagoDb seleccionarOtroPagoPorIdNomina(BigInteger idNomina) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        OtroPagoDb otroPagoDb = mapper.seleccionarOtroPagoPorIdNomina(idNomina);
        sesion.close();

        return otroPagoDb;

    }

    @Override
    public SubsidioAlEmpleoDb seleccionarSubsidioPorIdNomina(BigInteger idNomina) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        SubsidioAlEmpleoDb subsidioAlEmpleoDb = mapper.seleccionarSubsidioPorIdNomina(idNomina);
        sesion.close();

        return subsidioAlEmpleoDb;

    }

    @Override
    public CompensacionSaldosAFavorDb seleccionarCompensacionPorIdNomina(BigInteger idNomina) {

        sesion = SqlConfig.getSqlMapper().openSession();
        mapper = sesion.getMapper(NominaMapper.class);
        CompensacionSaldosAFavorDb compensacionSaldosAFavorDb = mapper.seleccionarCompensacionPorIdNomina(idNomina);
        sesion.close();

        return compensacionSaldosAFavorDb;

    }
}
