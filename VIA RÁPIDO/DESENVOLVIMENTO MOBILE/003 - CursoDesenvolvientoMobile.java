
            @Override
            protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity main);
            //Desenvolvimento do Button btnKmMT e associação
            //ao Button btnKmMT da Activity (tela)
            Button btnKmMtprog = (Button) findViewById(R.id.btnKMMt);
            //Estrutura responsável por verificar o momenta que o
            //botao e pressionado, disparando as ações (códigos)
            //para chamar a tela.
            btnKmMt prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //Intent informando que estamos na Activity "MainActivity"
            //e vamos para a Activity "Intent"
            Intent intent = new Intent(MainActivity.this, KmM.class);
            //Comando que executa a intenção desenvolvida anteriormente
            startActivity(intent);
          }
        });
      }
          