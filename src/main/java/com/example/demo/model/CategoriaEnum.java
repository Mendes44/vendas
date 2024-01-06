package com.example.demo.model;

public enum CategoriaEnum {
    ARTES("Artes"),
    ARTIGOS_DE_LUXO("Artigos de Luxo"),
    ATIVISMO_CAUSAS_SOCIAIS("Ativismo & Causas Sociais"),
    BELEZA_MAQUIAGEM("Beleza & Maquiagem"),
    BRINQUEDOS("Brinquedos"),
    CARROS_MOTOCICLETAS_VEICULOS("Carros, Motocicletas & Veículos"),
    CASAMENTO("Casamento"),
    CIENCIAS_CURIOCIDADES("Ciências & Curiosidades"),
    CHURRASCO("Churrasco"),
    CONSTRUCAO_CIVIL("Construção Civil"),
    CRIANCAS_BEBES("Crianças & Bebês"),
    CULTURA_NERD("Cultura Nerd"),
    DECORACAO("Decoração"),
    DIVERSIDADE_EMPODERAMENTO("Diversidade & Empoderamento"),
    EDUCACAO("Educação"),
    ESPORTES("Esportes"),
    FACAVOCMESMO("Faça Você Mesmo"),
    FAMILIA_MATERNIDADE("Família & Maternidade"),
    FITNESS("Fitness"),
    FINANCAS("Finanças"),
    GAMES("Games"),
    GASTRONOMIA_COMIDAS_BEBIDAS_RECEITAS("Gastronomia, Comidas, Bebidas & Receitas"),
    HUMOR("Humor"),
    LIFESTYLE("Lifestyle"),
    LIVROS_LEITURA("Livros & Leitura"),
    MODA("Moda"),
    MUSICA("Música"),
    NEGOCIOS_EMPREENDEDORISMO("Negócios & Empreendedorismo"),
    OPINIAO("Opinião"),
    PETS_ANIMAIS_BIOLOGIA("Pets, Animais, Biologia"),
    SAUDE("Saúde"),
    TECNOLOGIA("Tecnologia"),
    VAREJO("Varejo"),
    VARIEDADES("Variedades"),
    VIAGENS("Viagens"),
    POLITICA("Política"),
    TV_SERIES_FILMES_CINEMA("TV, Séries, Filmes, Cinema"),
    DIREITO_ADVOCACIA("Direito, Advocacia"),
    FOTOGRAFIA("Fotografia"),
    AGRICULTURA_RURAL("Agricultura, Rural"),
    DANCA("Dança"),
    NOTICIAS_ATUALIDADES("Notícias & Atualidades");

    private final String descricao;

    CategoriaEnum(String descricao) {
        this.descricao = descricao;
    }

    public  String getDescricao() {
        return descricao;
    }

    public static CategoriaEnum toEnum(String descricao){
        for (CategoriaEnum categoriaEnum : CategoriaEnum.values()){
            if (categoriaEnum.getDescricao().equals(descricao)){
                return categoriaEnum;
            }
        }
        throw new RuntimeException("Categoria não econtrada!!!");
    }

}
