package main.java.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GerenciadorFrases {
    private List<String> frases;


    public GerenciadorFrases() {
        this.frases = new ArrayList<>(List.of(
                "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
                "A melhor maneira de prever o futuro é criá-lo.",
                "A persistência é o caminho do êxito.",
                "Grandes jornadas começam com um único passo.",
                "Não sabendo que era impossível, ele foi lá e fez.",
                "Seja a mudança que você deseja ver no mundo.",
                "A única maneira de fazer um excelente trabalho é amar o que você faz.",
                "Feito é melhor do que perfeito.",
                "Foque no progresso, não na perfeição.",
                "Tudo o que a mente humana pode conceber e acreditar, ela pode conquistar.",
                "A força não vem da capacidade física, vem de uma vontade indomável.",
                "O que não nos mata nos torna mais fortes.",
                "A vida é 10% o que acontece comigo e 90% como eu reajo a isso.",
                "O melhor momento para plantar uma árvore foi há 20 anos. O segundo melhor momento é agora.",
                "Sempre parece impossível até que seja feito.",
                "Não conte os dias, faça os dias contarem.",
                "Acredite que você pode e você já está no meio do caminho.",
                "A única coisa que se coloca entre você e seu objetivo é a história que você conta a si mesmo.",
                "O sucesso não é definitivo, o fracasso não é fatal: o que conta é a coragem de continuar.",
                "Não espere por oportunidades, crie-as.",
                "A disciplina é a ponte entre metas e realizações.",
                "O maior erro que você pode cometer na vida é o de ficar o tempo todo com medo de cometer um.",
                "Comece onde você está. Use o que você tem. Faça o que você pode.",
                "Para colher o que nunca colheu, você precisa plantar o que nunca plantou.",
                "A dor é temporária, o orgulho é para sempre.",
                "Se você quer uma vida feliz, amarre-se a uma meta, não a pessoas ou coisas.",
                "A simplicidade é o último grau de sofisticação.",
                "Você perde 100% dos tiros que não dá.",
                "O tempo é o seu recurso mais precioso, não o desperdice vivendo a vida de outra pessoa.",
                "Os problemas são apenas oportunidades com roupas de trabalho.",
                "Não encontre defeitos, encontre soluções.",
                "Quem tem um porquê enfrenta qualquer como.",
                "Você é o mestre do seu destino, o capitão da sua alma.",
                "As pessoas dizem frequentemente que a motivação não dura. Bem, nem o banho, por isso recomendamos diariamente.",
                "Daqui a um ano você vai desejar ter começado hoje.",
                "Produtividade nunca é um acidente. É sempre o resultado de compromisso com a excelência.",
                "Pequenos riachos tornam-se grandes rios.",
                "Sua mente é para ter ideias, não para guardá-las.",
                "O segredo para progredir é começar.",
                "A paciência é amarga, mas seu fruto é doce.",
                "Não olhe para o relógio; faça o que ele faz. Continue andando.",
                "Seja tão bom que eles não possam te ignorar.",
                "Obstáculos são aquelas coisas assustadoras que você vê quando tira os olhos do seu objetivo.",
                "Vá em direção às suas metas com toda a sua força.",
                "A excelência não é um ato, mas um hábito.",
                "Quem para no tempo fica para trás.",
                "Mude seus pensamentos e você mudará seu mundo.",
                "A consistência supera o talento quando o talento não tem consistência.",
                "Grandes mentes discutem ideias; mentes médias discutem eventos; mentes pequenas discutem pessoas.",
                "A energia flui para onde a atenção está focada.",
                "A vida encolhe ou expande em proporção à coragem de uma pessoa.",
                "O otimismo é a fé que leva à realização.",
                "Seja um estudante enquanto ainda tiver algo para aprender, e isso significa a vida inteira.",
                "Você não é derrotado quando perde, você é derrotado quando desiste.",
                "Ouse saber.",
                "Quem vence a si mesmo é o maior dos guerreiros.",
                "Nenhum mar calmo tornou o marinheiro especialista.",
                "A imaginação é mais importante que o conhecimento.",
                "Tudo o que você sempre quis está do outro lado do seu medo.",
                "Não tenha medo de desistir do bom para ir atrás do ótimo.",
                "O sucesso é caminhar de fracasso em fracasso sem perder o entusiasmo.",
                "Para alcançar o topo, você deve começar pelo fundo.",
                "A melhor vingança é um sucesso massivo.",
                "Eu não falhei. Apenas encontrei 10 mil maneiras que não funcionam.",
                "Tudo o que temos de decidir é o que fazer com o tempo que nos é dado.",
                "Viva como se fosse morrer amanhã. Aprenda como se fosse viver para sempre.",
                "Nós nos tornamos aquilo que pensamos.",
                "O único lugar onde o sucesso vem antes do trabalho é no dicionário.",
                "Seus sonhos não têm data de validade. Respire fundo e tente novamente.",
                "Nunca é tarde demais para ser o que você poderia ter sido.",
                "A maior glória em viver não está em jamais cair, mas em nos levantar cada vez que caímos.",
                "O destino não é uma questão de sorte, é uma questão de escolha.",
                "O segredo da felicidade não é fazer o que se quer, mas querer o que se faz.",
                "A jornada é o que nos traz a felicidade, não o destino.",
                "As coisas mais belas do mundo não podem ser vistas ou tocadas, devem ser feltas com o coração.",
                "Conhece-te a ti mesmo e conhecerás o universo.",
                "A dúvida é o princípio da sabedoria.",
                "Agir, eis a inteligência verdadeira. Serei o que quiser.",
                "O homem que move montanhas começa carregando pedras pequenas.",
                "A sabedoria começa na reflexão.",
                "Não corrigir nossas falhas é o mesmo que cometer novos erros.",
                "A verdadeira sabedoria está em saber que você nada sabe.",
                "Onde há amor e sabedoria, não há medo nem ignorância.",
                "A ignorância é a raiz de todos os males.",
                "O sábio nunca diz tudo o que pensa, mas pensa sempre tudo o que diz.",
                "A paciência é o elemento chave do sucesso.",
                "Aprender é a única coisa de que a mente nunca se cansa.",
                "O conhecimento fala, mas a sabedoria escuta.",
                "Nada é permanente, exceto a mudança.",
                "A vida é uma peça de teatro que não permite ensaios.",
                "O tempo é o melhor professor, mas infelizmente mata todos os seus alunos.",
                "A verdade é filha do tempo, não da autoridade.",
                "A sabedoria não vem com a idade, vem com a reflexão sobre as experiências.",
                "Ria sempre que puder. É um remédio barato.",
                "A harmonia interior é o maior tesouro que alguém pode possuir.",
                "Ser você mesmo em um mundo que está constantemente tentando fazer de você outra coisa é a maior conquista.",
                "O valor das coisas não está no tempo que elas duram, mas na intensidade com que acontecem.",
                "A inteligência é a capacidade de se adaptar à mudança.",
                "O que sabemos é uma gota, o que ignoramos é um oceano.",
                "A única constante na vida é a mudança.",
                "Seja gentil com você mesmo. Você está fazendo o melhor que pode."
        ));
    }

    public void adicionarFrase(String frase){
        frases.add(frase);
    }

    public String sortearFrase(){
        if(frases.size() == 0){
            return "SEM FRASES";
        }

        Random random = new Random();

        int indiceAleatorio = random.nextInt(frases.size());

        return frases.get(indiceAleatorio);
    }
}
