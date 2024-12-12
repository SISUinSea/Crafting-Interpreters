package jlox;

public class Token {
    final TokenType type;  // enum으로 토큰의 종류를 scan할 때 파악해놓기
    final String lexeme;  // 원시 랙심 저장을 위한 필드
    final Object literal;  // 리터럴(숫자, 문자열 같은 값) 정보 저장을 위한 필드
    final int line;  // 에러 발생 시 위치를 알리기 위한 위치 정보

    Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    @Override
    public String toString() {
        return "[lox.Token Type]: " + type.name() + "\t\t, [lexeme]: " + lexeme;
    }
}
