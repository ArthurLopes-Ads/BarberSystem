import java.time.LocalDateTime;

public class Agendamento {

    private Cliente cliente;
    private Barbeiro barbeiro;
    private Servico servico;
    private Pagamento pagamento;
    private LocalDateTime dataHora;
    
    public Agendamento(Cliente cliente, Barbeiro barbeiro, Servico servico, Pagamento pagamento) {
        this.cliente = cliente;
        this.barbeiro = barbeiro;
        this.servico = servico;
        this.pagamento = pagamento;
        this.dataHora = LocalDateTime.now();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}