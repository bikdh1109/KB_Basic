import mitt from 'mitt';

export const emitter = mitt();
/* 
    mitt
    - 경량화된 이벤트 에미터 라이브러리
    - 간단한 이벤트 기반 통신을 구현 가능
*/

emitter.on('*', (type, e) => console.log(`# 이벤트로그 : ${type} -> ${e}`));
