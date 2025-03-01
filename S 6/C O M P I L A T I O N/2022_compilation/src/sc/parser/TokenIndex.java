/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.parser;

import sc.node.*;
import sc.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTVirgule(@SuppressWarnings("unused") TVirgule node)
    {
        this.index = 0;
    }

    @Override
    public void caseTDivise(@SuppressWarnings("unused") TDivise node)
    {
        this.index = 1;
    }

    @Override
    public void caseTPointVirgule(@SuppressWarnings("unused") TPointVirgule node)
    {
        this.index = 2;
    }

    @Override
    public void caseTFois(@SuppressWarnings("unused") TFois node)
    {
        this.index = 3;
    }

    @Override
    public void caseTMoins(@SuppressWarnings("unused") TMoins node)
    {
        this.index = 4;
    }

    @Override
    public void caseTParentheseOuvrante(@SuppressWarnings("unused") TParentheseOuvrante node)
    {
        this.index = 5;
    }

    @Override
    public void caseTParentheseFermante(@SuppressWarnings("unused") TParentheseFermante node)
    {
        this.index = 6;
    }

    @Override
    public void caseTCrochetOuvrant(@SuppressWarnings("unused") TCrochetOuvrant node)
    {
        this.index = 7;
    }

    @Override
    public void caseTCrochetFermant(@SuppressWarnings("unused") TCrochetFermant node)
    {
        this.index = 8;
    }

    @Override
    public void caseTAccoladeOuvrante(@SuppressWarnings("unused") TAccoladeOuvrante node)
    {
        this.index = 9;
    }

    @Override
    public void caseTAccoladeFermante(@SuppressWarnings("unused") TAccoladeFermante node)
    {
        this.index = 10;
    }

    @Override
    public void caseTEgal(@SuppressWarnings("unused") TEgal node)
    {
        this.index = 11;
    }

    @Override
    public void caseTInferieur(@SuppressWarnings("unused") TInferieur node)
    {
        this.index = 12;
    }

    @Override
    public void caseTEt(@SuppressWarnings("unused") TEt node)
    {
        this.index = 13;
    }

    @Override
    public void caseTOu(@SuppressWarnings("unused") TOu node)
    {
        this.index = 14;
    }

    @Override
    public void caseTNon(@SuppressWarnings("unused") TNon node)
    {
        this.index = 15;
    }

    @Override
    public void caseTPlus(@SuppressWarnings("unused") TPlus node)
    {
        this.index = 16;
    }

    @Override
    public void caseTNonnull(@SuppressWarnings("unused") TNonnull node)
    {
        this.index = 17;
    }

    @Override
    public void caseTSi(@SuppressWarnings("unused") TSi node)
    {
        this.index = 18;
    }

    @Override
    public void caseTAlors(@SuppressWarnings("unused") TAlors node)
    {
        this.index = 19;
    }

    @Override
    public void caseTSinon(@SuppressWarnings("unused") TSinon node)
    {
        this.index = 20;
    }

    @Override
    public void caseTTantque(@SuppressWarnings("unused") TTantque node)
    {
        this.index = 21;
    }

    @Override
    public void caseTFaire(@SuppressWarnings("unused") TFaire node)
    {
        this.index = 22;
    }

    @Override
    public void caseTEntier(@SuppressWarnings("unused") TEntier node)
    {
        this.index = 23;
    }

    @Override
    public void caseTRetour(@SuppressWarnings("unused") TRetour node)
    {
        this.index = 24;
    }

    @Override
    public void caseTLire(@SuppressWarnings("unused") TLire node)
    {
        this.index = 25;
    }

    @Override
    public void caseTEcrire(@SuppressWarnings("unused") TEcrire node)
    {
        this.index = 26;
    }

    @Override
    public void caseTNombre(@SuppressWarnings("unused") TNombre node)
    {
        this.index = 27;
    }

    @Override
    public void caseTIdentif(@SuppressWarnings("unused") TIdentif node)
    {
        this.index = 28;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 29;
    }
}
