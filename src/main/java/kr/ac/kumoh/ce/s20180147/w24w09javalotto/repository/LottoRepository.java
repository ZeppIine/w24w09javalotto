package kr.ac.kumoh.ce.s20180147.w24w09javalotto.repository;

import kr.ac.kumoh.ce.s20180147.w24w09javalotto.model.LottoNumber;

public interface LottoRepository {
    LottoNumber save(LottoNumber lottoNumber);
    LottoNumber find();
}