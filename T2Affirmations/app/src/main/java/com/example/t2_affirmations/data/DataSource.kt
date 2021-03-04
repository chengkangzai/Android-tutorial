package com.example.t2_affirmations.data

import com.example.t2_affirmations.R
import com.example.t2_affirmations.model.Affirmation

class DataSource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10),
        )
    }

    fun test() {
        val a: List<Affirmation> = this.loadAffirmations();

    }
}