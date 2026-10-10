# Olá Mundo - Android

Aplicativo Android mínimo que mostra **"Olá mundo"** no centro da tela.

## Informações

- Linguagem: Java
- Package: `com.example.olamundo`
- Min SDK: 23 (Android 6.0)
- Target/Compile SDK: 35
- Sem internet
- Sem permissões especiais
- Sem bibliotecas externas

## Compilar no Android Studio

1. Extraia o ZIP.
2. Abra o Android Studio.
3. Escolha **Open** e selecione a pasta `OlaMundoAndroid`.
4. Aguarde o Gradle Sync.
5. Vá em **Build > Build App Bundle(s) / APK(s) > Build APK(s)**.
6. O APK debug será criado em:
   `app/build/outputs/apk/debug/app-debug.apk`

> O projeto não inclui o Gradle Wrapper binário. O Android Studio pode usar/configurar uma instalação compatível de Gradle; use Gradle 8.9 com JDK 17 se for solicitado.

## Compilar pelo GitHub Actions (navegador)

O projeto já possui `.github/workflows/build-apk.yml`.

1. Crie um repositório no GitHub.
2. Envie todo o conteúdo desta pasta para o repositório.
3. Abra a aba **Actions**.
4. Selecione **Compilar APK**.
5. Clique em **Run workflow**.
6. Quando terminar, abra a execução e baixe o artefato **OlaMundo-APK**.
7. Dentro dele estará `app-debug.apk`.

## Arquivo principal

`app/src/main/java/com/example/olamundo/MainActivity.java`

Para mudar o texto, altere:

```java
texto.setText("Olá mundo");
```
