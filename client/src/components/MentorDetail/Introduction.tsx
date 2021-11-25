import React from 'react';
import styled from 'styled-components';
import { COLORS } from 'styles/Theme';
import SmileIcon from 'components/icon/SmileIcon';
import banner1 from 'assets/img/banner/column_banner_1.png';
import banner2 from 'assets/img/banner/column_banner_2.png';
import BannerImage from 'components/common/BannerImage';

const Container = styled.div`
  padding: 0 16px;
`;

const TitleWrapper = styled.div`
  display: flex;
  margin-bottom: 15px;
  & > svg {
    margin-right: 6px;
  }
`;

const Title = styled.h2`
  font-weight: 600;
  font-size: 16px;
  color: ${COLORS.black};
  line-height: 19px;
`;

const Description = styled.p`
  color: ${COLORS.gray_04};
  font-size: 14px;
  line-height: 23px;
  padding-left: 18px;
  padding-right: 14px;
`;

const CardContainer = styled.div`
  display: flex;
  justify-content: space-between;
  overflow: auto;
  white-space: nowrap;
  padding-left: 16px;
  margin-top: 12px;
  margin-bottom: 36px;

  &::-webkit-scrollbar {
    display: none;
  }

  & > img {
    margin-right: 8px;

    :last-child {
      margin-right: 0;
    }
  }
`;

const Introduction = () => {
  return (
    <>
      <Container>
        <TitleWrapper>
          <SmileIcon size={18} />
          <Title>워디 멘토를 소개해요!</Title>
        </TitleWrapper>
      </Container>
      <Description>
        안녕하세요. 영국에 온 지 1년이 된 워홀매니아 입니다. <br /> 영국 워킹 홀리데이 서류 준비부터
        집구하고, 나아가 문화차이 <br />
        까지 저 만의 노하우를 과감없이 알려드리겠습니다. <br />
        제가 겪었던 경험을 공유하며 같은 어려움을 겪는 분들께 공감과 도움을 드리고 싶습니다.
      </Description>

      <CardContainer>
        <BannerImage img={banner1} width={184} height={112} />
        <BannerImage img={banner2} width={184} height={112} />
      </CardContainer>
    </>
  );
};

export default Introduction;