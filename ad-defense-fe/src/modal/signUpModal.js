import React, { useState } from "react";
import { Modal, Button, Form } from "react-bootstrap";
import axios from "axios";

const SignUpModal = ({ show, onHide }) => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [passwordCheck, setPasswordCheck] = useState("");
  const [question, setQuestion] = useState("");
  const [answer, setAnswer] = useState("");

  const signUpSubmit = () => {
    const data = { email, password, passwordCheck, question, answer };
    console.log(data);
    axios
      .post("http://localhost:8080/api/signUp", data)
      .then((res) => {
        console.log(res.data); // 서버로부터 받은 응답을 출력합니다.
        onHide(); // 모달을 닫습니다.
      })
      .catch((err) => {
        console.error(err); // 에러가 발생하면 콘솔에 출력합니다.
      });
  };

  return (
    <div>
      <Modal show={show} onHide={onHide} size="lg" align-items="center">
        <Modal.Header closeButton>
          <Modal.Title className="text-center">Sign Up</Modal.Title>
        </Modal.Header>
        <Modal.Body>
          <Form>
            <Form.Group>
              <Form.Label>이메일</Form.Label>
              <Form.Control
                type="email"
                placeholder="예) email@gmail.com"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
              />
            </Form.Group>
            <Form.Group>
              <Form.Label>비밀번호</Form.Label>
              <Form.Control
                type="password"
                placeholder="비밀번호"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
              />
            </Form.Group>
            <Form.Group>
              <Form.Label>비밀번호 확인</Form.Label>
              <Form.Control
                type="password"
                placeholder="비밀번호 확인"
                value={passwordCheck}
                onChange={(e) => setPasswordCheck(e.target.value)}
              />
            </Form.Group>
            <Form.Group>
              <Form.Label>질문</Form.Label>
              <Form.Control
                as="select"
                value={question}
                onChange={(e) => setQuestion(e.target.value)}
              >
                <option value="">질문</option>
                <option value="What is your favorite color?">
                  What is your favorite color?
                </option>
                <option value="What is your mother's maiden name?">
                  What is your mother's maiden name?
                </option>
                <option value="What is your pet's name?">
                  What is your pet's name?
                </option>
              </Form.Control>
            </Form.Group>
            <Form.Group>
              <Form.Label>답변</Form.Label>
              <Form.Control
                type="text"
                placeholder="답변"
                value={answer}
                onChange={(e) => setAnswer(e.target.value)}
              />
            </Form.Group>
          </Form>
        </Modal.Body>
        <Modal.Footer>
          <Button variant="secondary" onClick={onHide}>
            Close
          </Button>
          <Button variant="primary" onClick={signUpSubmit}>
            Sign Up
          </Button>
        </Modal.Footer>
      </Modal>
    </div>
  );
};

export default SignUpModal;
