package br.com.apinaruto.model;


public record DadosListagemPersonagem(
        String nome,
        String cla,
        String estilo,
        String patente,
        String avatar,

        Integer idade) {

    public DadosListagemPersonagem(Personagem personagem) {
        this(personagem.getNome(), personagem.getCla(), personagem.getEstilo(), personagem.getPatente(), personagem.getAvatar(), personagem.getIdade());
    }

}
