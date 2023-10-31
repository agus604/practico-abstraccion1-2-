class Fraccion extends Numerica {
    private int numerador;
    private int denominador;

    public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // Getters y setters para los atributos numerador y denominador
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Fraccion fraccion = (Fraccion) ob;
        return numerador == fraccion.numerador && denominador == fraccion.denominador;
    }

    @Override
    public Numerica sumar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otraFraccion = (Fraccion) numero;
            int nuevoNumerador = (this.numerador * otraFraccion.denominador) + (otraFraccion.numerador * this.denominador);
            int nuevoDenominador = this.denominador * otraFraccion.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        return null; // Manejo de error
    }

    @Override
    public Numerica restar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otraFraccion = (Fraccion) numero;
            int nuevoNumerador = (this.numerador * otraFraccion.denominador) - (otraFraccion.numerador * this.denominador);
            int nuevoDenominador = this.denominador * otraFraccion.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        return null; // Manejo de error
    }

    @Override
    public Numerica multiplicar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otraFraccion = (Fraccion) numero;
            int nuevoNumerador = this.numerador * otraFraccion.numerador;
            int nuevoDenominador = this.denominador * otraFraccion.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        return null; // Manejo de error
    }

    @Override
    public Numerica dividir(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otraFraccion = (Fraccion) numero;
            // A / B ÷ C / D = A / B * D / C
            int nuevoNumerador = this.numerador * otraFraccion.denominador;
            int nuevoDenominador = this.denominador * otraFraccion.numerador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        return null; // Manejo de error
    }
}

